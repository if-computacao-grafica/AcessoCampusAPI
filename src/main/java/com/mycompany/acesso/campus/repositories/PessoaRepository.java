package com.mycompany.acesso.campus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.acesso.campus.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
