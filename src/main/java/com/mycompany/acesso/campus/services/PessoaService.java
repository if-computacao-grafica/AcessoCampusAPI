/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acesso.campus.services;

import com.mycompany.acesso.campus.dto.request.PessoaDTO;
import com.mycompany.acesso.campus.dto.mapper.PessoaMapper;
import com.mycompany.acesso.campus.entities.Pessoa;
import com.mycompany.acesso.campus.exceptions.PessoaNotFoundException;
import com.mycompany.acesso.campus.repositories.PessoaRepository;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

/**
 *
 * @author skmat
 */
@Service
public class PessoaService { 

    private PessoaRepository pessoaRepository;
    private PessoaMapper pessoaMapper;
    
    public PessoaService(PessoaRepository pessoaRepository, PessoaMapper pessoaMapper) {
        this.pessoaRepository = pessoaRepository;
        this.pessoaMapper = pessoaMapper;
    }
    
    public List<PessoaDTO> listAll() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
    
        return pessoas.stream().map(pessoaMapper::toDTO).collect(Collectors.toList());
    }
    
    public PessoaDTO findById(Long id) throws PessoaNotFoundException {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(() -> new PessoaNotFoundException(id));
        return pessoaMapper.toDTO(pessoa);
    }
    
    public void delete(Long id) throws PessoaNotFoundException {
        pessoaRepository.findById(id).orElseThrow(() -> new PessoaNotFoundException(id));
        pessoaRepository.deleteById(id);
    }
    
    public void create(PessoaDTO dto) {      
        Pessoa pessoa = pessoaMapper.toModel(dto);
        pessoaRepository.save(pessoa);
    }
}

    


