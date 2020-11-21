package com.example.spidercursos.api.aluno;


import com.example.spidercursos.business.AlunoService;
import com.example.spidercursos.infrastructure.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoRest {

    @Autowired
    AlunoService alunoService;

    @GetMapping
    public List<Aluno> listar() {
        return alunoService.alunoList();
    }

}
