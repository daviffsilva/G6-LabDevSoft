import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario {
    private int idProfessor;
    private String nome;

    public Professor(){
        
    }

    public Professor(String nome, String email, String senha, int idProfessor) {
        super(nome, email, senha);
        this.idProfessor = idProfessor;
        this.nome = nome;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String nome getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> consultarAlunosPorDisciplina(Disciplina disciplina) {
        List<Aluno> alunosCadastrados = new ArrayList<>();
        
        if (disciplina != null) {
            alunosCadastrados = disciplina.getAlunosInscritos();
        }
        
        return alunosCadastrados;
    }
    
}
