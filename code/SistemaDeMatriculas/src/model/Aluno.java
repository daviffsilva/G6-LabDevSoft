package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private int matricula;
    private List<Disciplina> disciplinasObrigatorias;
    private List<Disciplina> disciplinasAlternativas;

    public Aluno() {

    }

    public Aluno(String nome, String email, String senha, int matricula) {
        super(nome, email, senha);
        this.matricula = matricula;
        this.disciplinasObrigatorias = new ArrayList<>();
        this.disciplinasAlternativas = new ArrayList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasObrigatorias;
    }

    public List<Disciplina> getDisciplinasAlternativas() {
        return disciplinasAlternativas;
    }

    public void efetuarMatricula(Disciplina disciplina, boolean obrigatoria, boolean periodo_matricula) {
        if (periodo_matricula) {
            if (obrigatoria) {
                if (disciplinasObrigatorias.size() < 1 && !disciplinasObrigatorias.contains(disciplina)) {
                    disciplinasObrigatorias.add(disciplina);
                }
            } else {
                if (disciplinasAlternativas.size() < 2 && !disciplinasAlternativas.contains(disciplina)) {
                    disciplinasAlternativas.add(disciplina);
                }
            }
        } else {
            System.out.println("Fora do período de matrículas.");
        }
    }

    public void cancelarMatricula(Disciplina disciplina, boolean periodo_matricula) {
        if (periodo_matricula) {
            if (disciplinasObrigatorias.contains(disciplina)) {
                disciplinasObrigatorias.remove(disciplina);
            }
            if (disciplinasAlternativas.contains(disciplina)) {
                disciplinasAlternativas.remove(disciplina);
            }
        } else {
            System.out.println("Fora do período de matrículas.");
        }
    }
}
