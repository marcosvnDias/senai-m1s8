package br.com.education.senaim1s8.controller;

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
        return CursoModel.getCursos();
    }

    @PostMapping
    public CursoModel post (@RequestBody CursoModel curso) {
        return cursoService.cadastrar(curso);
    }
}
