/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acesso.campus.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author skmat
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PessoaNotFoundException extends Exception {
    
    public PessoaNotFoundException(Long id) {
        super(String.format("Pessoa com o ID %s não encontrada!", id));
    }
}
