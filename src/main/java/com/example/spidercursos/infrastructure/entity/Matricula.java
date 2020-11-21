package com.example.spidercursos.infrastructure.entity;

import javax.persistence.*;

@Entity
public class Matricula {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "turma")
    private Turma turma;
}