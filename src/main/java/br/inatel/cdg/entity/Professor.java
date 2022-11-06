package br.inatel.cdg.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Professor {

    private Long id;
    private String nome;
    private String horario;
    private Periodo periodo;
}
