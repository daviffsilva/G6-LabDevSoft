abstract class Usuario {
    protected String login;
    protected String email;
    protected String senha;

    public Usuario(){
        
    }

    public Usuario(String login, String email, String senha) {
        this.login = login;
        this.email = email;
        this.senha = senha;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
