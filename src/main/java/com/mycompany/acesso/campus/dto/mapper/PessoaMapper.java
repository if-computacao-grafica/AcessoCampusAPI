package com.mycompany.acesso.campus.dto.mapper;

import org.mapstruct.Mapper;

import com.mycompany.acesso.campus.dto.request.PessoaDTO;
import com.mycompany.acesso.campus.entities.Pessoa;

@Mapper(componentModel = "spring")
public interface PessoaMapper {
    
    Pessoa toModel(PessoaDTO dto);

    PessoaDTO toDTO(Pessoa pessoa);
}
