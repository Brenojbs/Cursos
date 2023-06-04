package com.rabbitmq.rabbitmq.consumer;

import com.rabbitmq.rabbitmq.dto.ProfissaoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.rabbitmq.rabbitmq.constantes.ConstantesRabbitMQ.NOME_FILA_TESTE1;
import static com.rabbitmq.rabbitmq.constantes.ConstantesRabbitMQ.NOME_FILA_TESTE2;

@Component
public class consumerRabbitMQ {
    @RabbitListener(queues = NOME_FILA_TESTE1)
    private void consumerFila1(ProfissaoDTO profissaoDTO) {
        System.out.println("Fila 1");
        System.out.println("Nome da Profissão: " + profissaoDTO.name);
        System.out.println("Salario médio: " + profissaoDTO.salario);
        System.out.println("");
    }
    @RabbitListener(queues = NOME_FILA_TESTE2)
    private void consumerFila2(ProfissaoDTO profissaoDTO) {
        System.out.println("Fila 2");
        System.out.println("Nome da Profissão: " + profissaoDTO.name);
        System.out.println("Salario médio: " + profissaoDTO.salario);
        System.out.println("");
    }
}
