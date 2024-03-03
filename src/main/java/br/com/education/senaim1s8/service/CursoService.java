package br.com.education.senaim1s8.service;

import br.com.education.senaim1s8.model.CursoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    public List<CursoModel> listarCursos () {
        return CursoModel.getCursos();
    }

    public CursoModel cadastrar (CursoModel curso) {
        CursoModel.inserir(curso);
        return curso;
    }
}
