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

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getMinAlunos() {
        return minAlunos;
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public StatusTurma getStatusTurma() {
        return statusTurma;
    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public List<Aluno> getListAlunos() {
        return listAlunos;
    }
}
