package com.piaget.universidade.Controller;

import com.piaget.universidade.Models.Aluno;
import com.piaget.universidade.Service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AlunoController {
    private final AlunoService service;
    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> buscarAlunos(){
        return service.alunoList();
    }


}
