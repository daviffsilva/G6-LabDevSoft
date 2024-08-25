import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private int matricula;
    private List<Disciplina> disciplinasMatriculadas;
    private List<Disciplina> disciplinasAlternativas;

    public Aluno(String nome, String email, String senha, int matricula) {
        super(nome, email, senha);
        this.matricula = matricula;
        this.disciplinasMatriculadas = new ArrayList<>();
        this.disciplinasAlternativas = new ArrayList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(List<Disciplina> disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public List<Disciplina> getDisciplinasAlternativas() {
        return disciplinasAlternativas;
    }

    public void setDisciplinasAlternativas(List<Disciplina> disciplinasAlternativas) {
        this.disciplinasAlternativas = disciplinasAlternativas;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        // stub
    }

    public void cancelarMatricula(Disciplina disciplina) {
        // stub
    }
}
