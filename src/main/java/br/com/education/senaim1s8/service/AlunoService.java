package br.com.education.senaim1s8.service;

import br.com.education.senaim1s8.model.AlunoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    public List<AlunoModel> listarAlunos () {
        return AlunoModel.getAlunos();
    }

    public AlunoModel cadastrar (AlunoModel aluno) {
        AlunoModel.inserir(aluno);
        return aluno;
    }

}
