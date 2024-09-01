import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario {
    private int idProfessor;
    private List<Disciplina> disciplinasLecionadas;

    public Professor(){
        
    }

    public Professor(String nome, String email, String senha, int idProfessor) {
        super(nome, email, senha);
        this.idProfessor = idProfessor;
        this.disciplinasLecionadas = new ArrayList<>();
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public List<Disciplina> getDisciplinasLecionadas() {
        return disciplinasLecionadas;
    }

    public void setDisciplinasLecionadas(List<Disciplina> disciplinasLecionadas) {
        this.disciplinasLecionadas = disciplinasLecionadas;
    }

    public List<Aluno> listarAlunosPorDisciplina(Disciplina disciplina) {
        // stub
        return null;
    }
}
