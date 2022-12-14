/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acesso.campus.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author skmat
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {
    
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String fullName;
}
