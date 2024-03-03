package br.com.education.senaim1s8.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CursoModel {
    private static Integer idGeral = 1;
    private Integer id;
    @Setter private String nome;
    @Setter private String descricao;
    private static List<CursoModel> cursos = new ArrayList<>();

    public static Integer proximoId () {
        return idGeral++;
    }

    public static List<CursoModel> getAlunos () {
        return cursos;
    }

    public static CursoModel inserir (CursoModel curso) {
        curso.id = proximoId();
        cursos.add(curso);
        return curso;
    }
}
