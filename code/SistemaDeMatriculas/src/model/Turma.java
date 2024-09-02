package model;

import java.util.List;

public class Turma {
    private int id;
    private String nome;
    private int minAlunos;
    private int maxAlunos;
    private Professor professor;
    private Disciplina disciplina;
    private StatusTurma statusTurma;
    private Curriculo curriculo;
    private List<Aluno> listAlunos;
}
