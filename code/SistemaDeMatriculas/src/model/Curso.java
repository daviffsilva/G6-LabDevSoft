package model;

import controller.CursoController;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int numeroDeCreditos;
    private List<Disciplina> disciplinas;

    public Curso(String nome, int numeroDeCreditos) {
        this.nome = nome;
        this.numeroDeCreditos = numeroDeCreditos;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeCreditos() {
        return numeroDeCreditos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(String nome, int codigo, Professor professor) {
        CursoController controller = new CursoController();
        controller.adicionarDisciplina(nome, codigo, professor);
    }

    public void removerDisciplina(Disciplina disciplina) {
        CursoController controller = new CursoController();
        controller.removerDisciplina(disciplina);
    }
}
