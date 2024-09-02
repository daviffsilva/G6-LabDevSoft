package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private int codigo;
    private boolean ativa;
    private List<Aluno> alunosInscritos;
    private Professor professor;
    private int minimoAlunosParaAtivacao = 3;

    public Disciplina(String nome, int codigo, Professor professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
        this.alunosInscritos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public boolean inscreverAluno(Aluno aluno) {
        for (Aluno inscrito : alunosInscritos) {
            if (inscrito.getMatricula() == aluno.getMatricula()) {
                return false; 
            }
        }
        alunosInscritos.add(aluno);
        return true; 
    }

    public boolean cancelarInscricao(Aluno aluno) {
        
        for (Aluno inscrito : alunosInscritos) {
            if (inscrito.getMatricula() == aluno.getMatricula()) {
                alunosInscritos.remove(inscrito);
                return true; 
            }
        }
        return false; 
    }

    public boolean verificarAtivacao() {
        return alunosInscritos.size() >= minimoAlunosParaAtivacao;
    }
}
