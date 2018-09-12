package model;

public class Usuario {
    private String usuario_nome;
    private String usuario_cpf;
    private String usuario_senha;
    private String usuario_login;
    private String usuario_tipo;

    public Usuario() {
    }

    public Usuario(String usuario_nome, String usuario_cpf, String usuario_senha, String usuario_login, String usuario_tipo) {
        this.usuario_nome = usuario_nome;
        this.usuario_cpf = usuario_cpf;
        this.usuario_senha = usuario_senha;
        this.usuario_login = usuario_login;
        this.usuario_tipo = usuario_tipo;
    }

    public String getUsuario_nome() {
        return usuario_nome;
    }

    public void setUsuario_nome(String usuario_nome) {
        this.usuario_nome = usuario_nome;
    }

    public String getUsuario_cpf() {
        return usuario_cpf;
    }

    public void setUsuario_cpf(String usuario_cpf) {
        this.usuario_cpf = usuario_cpf;
    }

    public String getUsuario_senha() {
        return usuario_senha;
    }

    public void setUsuario_senha(String usuario_senha) {
        this.usuario_senha = usuario_senha;
    }

    public String getUsuario_login() {
        return usuario_login;
    }

    public void setUsuario_login(String usuario_login) {
        this.usuario_login = usuario_login;
    }

    public String getUsuario_tipo() {
        return usuario_tipo;
    }

    public void setUsuario_tipo(String usuario_tipo) {
        this.usuario_tipo = usuario_tipo;
    }
    
    
}