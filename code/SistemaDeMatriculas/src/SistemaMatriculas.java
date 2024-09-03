import model.Aluno;
import model.Curso;
import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class SistemaMatriculas {
    private List<Curso> cursos;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private Boolean periodo_matricula;

    public SistemaMatriculas() {
        this.cursos = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.periodo_matricula = false;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public void abrirPeriodoDeMatriculas() {
        System.out.println("Período de matrículas está aberto.");
        this.periodo_matricula = true;
    }

    public void fecharPeriodoDeMatriculas() {
        System.out.println("Período de matrículas está fechado.");
        this.periodo_matricula = false;
    }
}
