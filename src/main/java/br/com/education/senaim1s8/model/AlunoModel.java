package br.com.education.senaim1s8.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class AlunoModel {
    private static Integer idGeral = 1;
    private Integer id;
    @Setter private String nome;
    @Setter private LocalDate dataNascimento;
    @Getter private static final List<AlunoModel> alunos = new ArrayList<>();

    public static Integer proximoId () {
        return idGeral++;
    }

    public static AlunoModel inserir (AlunoModel aluno) {
        aluno.id = proximoId();
        alunos.add(aluno);
        return aluno;
    }

    public static AlunoModel buscarPorId (Integer id) throws Exception {
        for (AlunoModel aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        throw new Exception("Curso não encontrado");
    }

}
