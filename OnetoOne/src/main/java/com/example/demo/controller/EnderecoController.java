package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Endereco;
import com.example.demo.services.EnderecoService;


@RestController
@RequestMapping("/endereco")

public class EnderecoController {
    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @PostMapping
    public Endereco createEndereco(@RequestBody Endereco endereco) {
        return enderecoService.saveEndereco(endereco);
    }

    @GetMapping("/{id}")
    public Endereco getEndereco(@PathVariable Long id) {
        return enderecoService.findEnderecoById(id);
    }

    @GetMapping
    public List<Endereco> getAllEndereco() {
        return enderecoService.getAllEndereco();
    }

    @DeleteMapping("/{id}")
    public void deleteEndereco(@PathVariable Long id) {
    	enderecoService.findEnderecoById(id);
    }
    
}
