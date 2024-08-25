import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private int codigo;
    private int creditos;
    private List<Aluno> alunosInscritos;
    private Professor professor;

    public Disciplina(String nome, int codigo, int creditos, Professor professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.creditos = creditos;
        this.professor = professor;
        this.alunosInscritos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(List<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public boolean inscreverAluno(Aluno aluno) {
        // stub
        return false;
    }

    public boolean cancelarInscricao(Aluno aluno) {
        // stub
        return false;
    }

    public boolean verificarAtividade() {
        // stub
        return false;
    }
}
