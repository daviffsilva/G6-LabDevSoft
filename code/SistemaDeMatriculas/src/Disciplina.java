import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private int codigo;
    private int creditos;
    private boolean ativa;
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

    public int getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public List<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public boolean inscreverAluno(Aluno aluno) {
        // stub
        return false;
    }

    public boolean cancelarInscricao(Aluno aluno) {
        // stub
        return false;
    }

    public boolean verificarAtivacao() {
        // stub
        return false;
    }
}
