package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Endereco;
import com.example.demo.repositories.EnderecoRepository;


@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public EnderecoService (EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    
    public Endereco findEnderecoById(Long id) {
        Optional<Endereco> Endereco = enderecoRepository.findById(id);
        return Endereco.orElse(null);
    }

   
    public List<Endereco> findAllEndereco() {
        return enderecoRepository.findAll();
    }

    
    public Endereco insertEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco saveEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

	public Endereco getEnderecoById(long funcodigo) {
		return enderecoRepository.findById(funcodigo).orElse(null);
	}
	
	public List<Endereco> getAllEndereco() {
		return enderecoRepository.findAll();
	}

    
}