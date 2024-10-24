package com.example.ac2.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DadosFuncionarioDTO {
    private Long id;
    private String nome;
    private SetorDTO setor;
    private ProjetoDTO projeto;
}
