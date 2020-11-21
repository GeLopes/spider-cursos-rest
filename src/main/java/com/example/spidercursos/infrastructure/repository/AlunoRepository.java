package com.example.spidercursos.infrastructure.repository;

import com.example.spidercursos.infrastructure.entity.Aluno;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlunoRepository {

    private final AlunoDAO alunoDAO;

    public AlunoRepository(AlunoDAO alunoDAO){
        this.alunoDAO = alunoDAO;
    }

    public List<Aluno> listAll(){
      return (List<Aluno>) alunoDAO.findAll();
    }
}
