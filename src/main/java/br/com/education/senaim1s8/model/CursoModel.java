package br.com.education.senaim1s8.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class CursoModel {
    private static Integer idGeral = 1;
    private Integer id;
    @Setter private String nome;
    @Setter private String descricao;

    private static Integer proximoId () {
        return idGeral++;
    }
}
