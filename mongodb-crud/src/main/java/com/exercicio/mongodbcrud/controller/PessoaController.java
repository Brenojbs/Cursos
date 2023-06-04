package com.exercicio.mongodbcrud.controller;

import com.exercicio.mongodbcrud.dto.PessoaDTO;
import com.exercicio.mongodbcrud.service.PessoaService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {
  private PessoaService pessoaService;

  @ExceptionHandler(NullPointerException.class)
  public ResponseEntity<String> handleMinhaExcecao(NullPointerException ex) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
  }

  public PessoaController(PessoaService pessoaService) {
    this.pessoaService = pessoaService;
  }

  @PostMapping()
  public PessoaDTO create(@RequestBody PessoaDTO pessoaDTO) throws Exception{
	  try {
		  return pessoaService.create(pessoaDTO);		
	} catch (NullPointerException e) {
		throw new NullPointerException(e.getMessage());
	} catch (Exception e) {
		throw new NullPointerException(e.getMessage());
	}
  }

  @GetMapping()
  public List<PessoaDTO> findAll() throws Exception{
	  try {
		  return pessoaService.findAll();		
	} catch (Exception e) {
		throw new Exception(e.getMessage());
	}
  }

  @GetMapping("/{id}")
  public PessoaDTO findById(@PathVariable String id){
	  try {
		  return pessoaService.findById(id);		
	} catch (NullPointerException e) {
		throw new NullPointerException(e.getMessage());
	}
  }

  @PutMapping()
  public PessoaDTO put(@RequestBody PessoaDTO pessoa){
    try{
	  return pessoaService.put(pessoa);
  } catch (NullPointerException e) {
		throw new NullPointerException(e.getMessage());
	}
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable String id){
    try {
	  pessoaService.delete(id);
  } catch (NullPointerException e) {
		throw new NullPointerException(e.getMessage());
	}
  }
}
