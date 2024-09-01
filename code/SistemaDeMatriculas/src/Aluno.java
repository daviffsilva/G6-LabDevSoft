import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private int matricula;
    private List<Disciplina> disciplinasObrigatorias;
    private List<Disciplina> disciplinasAlternativas;

    public Aluno(){
        
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

    public void matricularDisciplina(Disciplina disciplina) {
        // stub
    }

    public void cancelarMatricula(Disciplina disciplina) {
        // stub
    }
}
