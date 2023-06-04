package com.exercicio.mongodbcrud.service;

import com.exercicio.mongodbcrud.dto.PessoaDTO;
import com.exercicio.mongodbcrud.model.Pessoa;
import com.exercicio.mongodbcrud.repository.PessoaRepository;
import com.exercicio.mongodbcrud.stub.PessoaStub;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PessoaServiceTest {
  @Mock
  private PessoaRepository<String> pessoaRepository;
  private PessoaService pessoaService;

  @Before
  public void init() {
    pessoaRepository = mock(PessoaRepository.class);
    pessoaService = new PessoaService(pessoaRepository);
  }

  @Test
  public void create() throws Exception {
    Pessoa pessoa = PessoaStub.generatePessoa();
    when(pessoaRepository.save(any())).thenReturn(pessoa);
    assertEquals(new PessoaDTO(pessoa), pessoaService.create(new PessoaDTO(pessoa)));
  }

  @Test
  public void finById() {
    Pessoa pessoa = PessoaStub.generatePessoa();
    when(pessoaRepository.findById(any())).thenReturn(Optional.of(pessoa));
    assertEquals(new PessoaDTO(pessoa), pessoaService.findById("1234"));
  }

  @Test
  public void findAll() throws Exception {
    Pessoa pessoa = PessoaStub.generatePessoa();
    when(pessoaRepository.findAll()).thenReturn(List.of(pessoa));
    assertEquals(new PessoaDTO(pessoa), pessoaService.findAll().get(0));
  }

  @Test
  public void put() {
    Pessoa pessoa = PessoaStub.generatePessoa();
    when(pessoaRepository.findById(any())).thenReturn(Optional.of(pessoa));
    when(pessoaRepository.save(any())).thenReturn(pessoa);
    assertEquals(new PessoaDTO(pessoa), pessoaService.put(new PessoaDTO(pessoa)));
  }

  @Test
  public void delete() {
    Pessoa pessoa = PessoaStub.generatePessoa();
    when(pessoaRepository.findById(any())).thenReturn(Optional.of(pessoa));
    pessoaService.delete("1erwr5e41rw36");
    verify(pessoaRepository, times(1)).delete(any());
  }
}
