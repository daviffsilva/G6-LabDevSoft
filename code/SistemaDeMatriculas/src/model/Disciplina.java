package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private int creditos;

    public Disciplina(String nome, String codigo, int creditos) {
        this.nome = nome;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }
}
