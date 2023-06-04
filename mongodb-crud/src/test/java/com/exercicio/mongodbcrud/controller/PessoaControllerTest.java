package com.exercicio.mongodbcrud.controller;

import com.exercicio.mongodbcrud.service.PessoaService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PessoaControllerTest {
  @Mock
  private PessoaService pessoaService;
  private PessoaController pessoaController;
  @Before
  public void init() {
    pessoaService = mock(PessoaService.class);
    pessoaController = new PessoaController(pessoaService);
  }

  @Test
  public void create() throws Exception {
    pessoaController.create(any());
    verify(pessoaService, times(1)).create(any());
  }

  @Test
  public void finById() {
    pessoaController.findById(any());
    verify(pessoaService, times(1)).findById(any());
  }

  @Test
  public void findAll() throws Exception {
    pessoaController.findAll();
    verify(pessoaService, times(1)).findAll();
  }

  @Test
  public void put() {
    pessoaController.put(any());
    verify(pessoaService, times(1)).put(any());
  }

  @Test
  public void delete() {
    pessoaController.delete(any());
    verify(pessoaService, times(1)).delete(any());
  }
}
