package com.rabbitmq.rabbitmq.controller;

import com.rabbitmq.rabbitmq.constantes.ConstantesRabbitMQ;
import com.rabbitmq.rabbitmq.dto.ProfissaoDTO;
import com.rabbitmq.rabbitmq.service.ProfissaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "profissao/")
public class ProfissaoController {
    private ProfissaoService profissaoService;

    public ProfissaoController(ProfissaoService profissaoService) {
        this.profissaoService = profissaoService;
    }

    @PostMapping(value = "mensagemFila1")
    public ResponseEntity enviaMensagemFila1(@RequestBody ProfissaoDTO profissaoDTO) {
        profissaoService.enviarMensagemRabbit(ConstantesRabbitMQ.NOME_FILA_TESTE1, profissaoDTO);
        return ResponseEntity.ok(profissaoDTO);
    }

    @PostMapping(value = "mensagemFila2")
    public ResponseEntity enviaMensagemFila2(@RequestBody ProfissaoDTO profissaoDTO) {
        profissaoService.enviarMensagemRabbit(ConstantesRabbitMQ.NOME_FILA_TESTE2, profissaoDTO);
        return ResponseEntity.ok(profissaoDTO);
    }
}
