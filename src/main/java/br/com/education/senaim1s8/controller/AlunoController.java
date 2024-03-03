package br.com.education.senaim1s8.controller;

import br.com.education.senaim1s8.model.AlunoModel;
import br.com.education.senaim1s8.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<AlunoModel> get () {
        return alunoService.listarAlunos();
    }

    @PostMapping
    public AlunoModel post (@RequestBody AlunoModel aluno) {
        return alunoService.cadastrar(aluno);
    }
}
