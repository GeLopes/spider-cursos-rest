package com.example.spidercursos.business;

import com.example.spidercursos.infrastructure.entity.Aluno;
import com.example.spidercursos.infrastructure.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> alunoList(){
       return alunoRepository.listAll();
    }

}
