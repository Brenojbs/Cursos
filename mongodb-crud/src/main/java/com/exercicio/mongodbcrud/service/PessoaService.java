package com.exercicio.mongodbcrud.service;

import com.exercicio.mongodbcrud.dto.PessoaDTO;
import com.exercicio.mongodbcrud.model.Pessoa;
import com.exercicio.mongodbcrud.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PessoaService {
  private PessoaRepository<String> pessoaRepository;

  public PessoaService(PessoaRepository<String> pessoaRepository) {
    this.pessoaRepository = pessoaRepository;
  }

  public PessoaDTO create(PessoaDTO pessoaDTO) throws Exception {
    try {
      verifyPessoa(pessoaDTO);
      return new PessoaDTO((Pessoa) pessoaRepository.save(new Pessoa(pessoaDTO)));
    } catch (NullPointerException e) {
      throw new NullPointerException(e.getMessage());
    }
  }

  public List<PessoaDTO> findAll() {
    try {
    	List<PessoaDTO> pessoaDTOList = new ArrayList<>();
    	List<Pessoa> pessoaList = pessoaRepository.findAll();
    	for (Pessoa pessoa : pessoaList) {
			pessoaDTOList.add(new PessoaDTO(pessoa));
		}
      return pessoaDTOList;
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }

  public PessoaDTO findById(String id) {
    try {
      verifyId(id);
      return new PessoaDTO((Pessoa) pessoaRepository.findById(id).get());
    } catch (NullPointerException e) {
      throw new NullPointerException();
    }
  }

  public PessoaDTO put(PessoaDTO pessoaDTO) {
    try {
      verifyId(pessoaDTO.getId());
      Pessoa pessoa = (Pessoa) pessoaRepository.findById(pessoaDTO.getId()).get();
      pessoa.setName(pessoaDTO.getName());
      pessoa.setIdade(pessoaDTO.getIdade());
      pessoa.setCpf(pessoaDTO.getCpf());

      return new PessoaDTO((Pessoa) pessoaRepository.save(pessoa));
    } catch (NullPointerException e) {
      throw new NullPointerException();
    }
  }

  public void delete(String id) {
    try {
      verifyId(id);
      Pessoa pessoa = (Pessoa) pessoaRepository.findById(id).get();
      pessoaRepository.delete(pessoa);
    } catch (NullPointerException e) {
      throw new NullPointerException();
    }
  }

  private void verifyId(String id) {
    try {
      if (id.isEmpty()) {
        throw new NullPointerException("Id is Null!");
      }
    } catch (NullPointerException e) {
      throw new NullPointerException(e.getMessage());
    }
  }

  private void verifyPessoa(PessoaDTO pessoaDTO) throws Exception {
    try {
      int TAMANHO = 11;

      if (pessoaDTO.getName().equals("") || pessoaDTO.getName().isEmpty()) {
        throw new NullPointerException("Name is Null!");
      }
      if (Objects.isNull(pessoaDTO.getIdade()) || pessoaDTO.getIdade() == 0) {
        throw new NullPointerException("Idade is Null!");
      }
      if (Objects.isNull(pessoaDTO.getCpf()) || pessoaDTO.getCpf().isEmpty()) {
        throw new NullPointerException("CPF is Null!");
      }
      if (pessoaDTO.getCpf().length() != TAMANHO) {
        throw new NullPointerException("CPF Invalid! Only 11 numbers!");
      }
      Long.parseLong(pessoaDTO.getCpf());
    } catch (NullPointerException e) {
      throw new NullPointerException(e.getMessage());
    } catch (Exception e) {
      throw new Exception("CPF invalid! Only Numbers!!!");
    }
  }
}
