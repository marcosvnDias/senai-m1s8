package br.com.education.senaim1s8.controller;

import br.com.education.senaim1s8.model.AlunoModel;
import br.com.education.senaim1s8.model.CursoModel;
import br.com.education.senaim1s8.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<CursoModel> get () {
        return cursoService.listarCursos();
    }

    @PostMapping
    public CursoModel post (@RequestBody CursoModel curso) {
        return cursoService.cadastrar(curso);
    }

    @PostMapping("{id}/add-aluno")
    public CursoModel post (@PathVariable Integer id, @RequestBody Integer idAluno) throws Exception {
        return cursoService.matricularAluno(idAluno, id);
    }
}
