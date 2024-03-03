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
    @Getter private static final List<CursoModel> cursos = new ArrayList<>();
    @Getter private final List<AlunoModel> alunosMatriculados = new ArrayList<>();

    public static Integer proximoId () {
        return idGeral++;
    }

    public static CursoModel buscarPorId (Integer id) throws Exception {
        for (CursoModel curso : cursos) {
            if (curso.getId().equals(id)) {
                return curso;
            }
        }
        throw new Exception("Curso não encontrado");
    }

    public static CursoModel inserir (CursoModel curso) {
        curso.id = proximoId();
        cursos.add(curso);
        return curso;
    }

    public static void inserir (AlunoModel aluno, CursoModel curso) {
        curso.getAlunosMatriculados().add(aluno);
    }
}
