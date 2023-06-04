package com.exercicio.mongodbcrud.model;

import com.exercicio.mongodbcrud.dto.PessoaDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
@Document(collection = "pessoas")
public class Pessoa {

  @Id
  private String id;
  private String name;
  private int idade;
  private String cpf;

  public Pessoa() {
  }

  public Pessoa(PessoaDTO pessoaDTO) {
    this.name = pessoaDTO.getName();
    this.idade = pessoaDTO.getIdade();
    this.cpf = pessoaDTO.getCpf();
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
