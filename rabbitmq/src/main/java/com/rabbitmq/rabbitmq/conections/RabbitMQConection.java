package com.rabbitmq.rabbitmq.conections;

import com.rabbitmq.rabbitmq.constantes.ConstantesRabbitMQ;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RabbitMQConection {
    private AmqpAdmin amqpAdmin;

    public RabbitMQConection(AmqpAdmin amqpAdmin) {
        this.amqpAdmin = amqpAdmin;
    }

    private Queue fila(String nomeFila) {
        return new Queue(nomeFila, true, false, false);
    }

    private DirectExchange trocaDireta() {
        return new DirectExchange(ConstantesRabbitMQ.NOME_EXCHANGE);
    }

    private Binding relacionamento(Queue fila, DirectExchange troca) {
        return new Binding(fila.getName(), Binding.DestinationType.QUEUE, troca.getName(), fila.getName(), null);
    }
    @PostConstruct
    private void adiciona() {
        Queue filaTeste1 = this.fila(ConstantesRabbitMQ.NOME_FILA_TESTE1);
        Queue filaTeste2 = this.fila(ConstantesRabbitMQ.NOME_FILA_TESTE2);

        DirectExchange troca = this.trocaDireta();

        Binding ligacao1 = this.relacionamento(filaTeste1, troca);
        Binding ligacao2 = this.relacionamento(filaTeste2, troca);

        this.amqpAdmin.declareQueue(filaTeste1);
        this.amqpAdmin.declareQueue(filaTeste2);

        this.amqpAdmin.declareExchange(troca);

        this.amqpAdmin.declareBinding(ligacao1);
        this.amqpAdmin.declareBinding(ligacao2);
    }
}
