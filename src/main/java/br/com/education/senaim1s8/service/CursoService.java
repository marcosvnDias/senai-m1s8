package br.com.education.senaim1s8.service;

import br.com.education.senaim1s8.model.AlunoModel;
import br.com.education.senaim1s8.model.CursoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {


    public List<CursoModel> listarCursos () {
        return CursoModel.getCursos();
    }

    public CursoModel cadastrar (CursoModel curso) {
        return CursoModel.inserir(curso);
    }

    public CursoModel matricularAluno (Integer idAluno, Integer idCurso) throws Exception {
        AlunoModel aluno = AlunoModel.buscarPorId(idAluno);
        CursoModel curso = CursoModel.buscarPorId(idCurso);
        CursoModel.inserir(aluno, curso);
        return curso;
    }

    public CursoModel buscarPorId (Integer id) throws Exception {
        return CursoModel.buscarPorId(id);
    }


}
