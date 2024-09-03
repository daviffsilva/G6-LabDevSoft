package model;

public enum StatusTurma {
    MATRICULA_ABERTA(1, ""),
    MATRICULA_FECHADA(2, ""),
    INICIADA(3, ""),
    TERMINADA(4, ""),
    CANCELADA(5, ""),
    CRIADA(6, "");

    private int id;
    private String descricao;

    StatusTurma(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
}
