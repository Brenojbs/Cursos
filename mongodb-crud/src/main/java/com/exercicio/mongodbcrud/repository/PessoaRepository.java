package com.exercicio.mongodbcrud.repository;

import com.exercicio.mongodbcrud.model.Pessoa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository<T> extends MongoRepository<Pessoa, T> {
}
