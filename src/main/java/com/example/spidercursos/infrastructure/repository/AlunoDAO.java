package com.example.spidercursos.infrastructure.repository;

import com.example.spidercursos.infrastructure.entity.Aluno;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AlunoDAO extends PagingAndSortingRepository<Aluno, Long> {


}