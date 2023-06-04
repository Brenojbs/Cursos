package com.exercicio.mongodbcrud.dto;

import com.exercicio.mongodbcrud.model.Pessoa;

import lombok.Data;

@Data
public class PessoaDTO {
  private String id;
  private int idade;
  private String name;
  private String cpf;

  public PessoaDTO(String name, int idade, String cpf) {
    this.name = name;
    this.idade = idade;
    this.cpf = cpf;
  }

  public PessoaDTO(Pessoa pessoa) {
    this.id = pessoa.getId();
    this.idade = pessoa.getIdade();
    this.name = pessoa.getName();
    this.cpf = pessoa.getCpf();
  }

  public PessoaDTO() {}

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
