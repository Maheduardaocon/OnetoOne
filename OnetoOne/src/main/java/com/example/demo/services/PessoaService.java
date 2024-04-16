package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Pessoa;
import com.example.demo.repositories.PessoaRepository;



@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaService (PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    
    public Pessoa findPessoaById(Long id) {
        Optional<Pessoa> Pessoa = pessoaRepository.findById(id);
        return Pessoa.orElse(null);
    }

   
    public List<Pessoa> findAllPessoa() {
        return pessoaRepository.findAll();
    }

    
    public Pessoa insertPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa savePessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

	public Pessoa getPessoaById(long funcodigo) {
		return pessoaRepository.findById(funcodigo).orElse(null);
	}
	
	public List<Pessoa> getAllPessoa() {
		return pessoaRepository.findAll();
	}

    
}