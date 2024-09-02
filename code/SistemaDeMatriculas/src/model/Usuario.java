package model;

abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;

    public Usuario(){
        
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public boolean validarLogin(String senha) {
        return this.senha.equals(senha);
    }
}
