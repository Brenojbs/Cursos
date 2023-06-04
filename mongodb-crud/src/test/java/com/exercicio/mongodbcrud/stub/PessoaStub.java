package com.exercicio.mongodbcrud.stub;

import com.exercicio.mongodbcrud.model.Pessoa;

public class PessoaStub {
  public static Pessoa generatePessoa() {
    Pessoa pessoa = new Pessoa();
    pessoa.setId("123");
    pessoa.setName("Beto");
    pessoa.setIdade(27);
    pessoa.setCpf("12345678912");
    return pessoa;
  }
}
