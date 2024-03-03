package br.com.education.senaim1s8.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
public class AlunoModel {
    private static Integer idGeral = 1;
    private Integer id;
    @Setter private String nome;
    @Setter private LocalDate dataNascimento;

    private static Integer proximoId () {
        return idGeral++;
    }

}
