package br.edu.ifpb.sistema;

public class Usuario {
    protected String nome;
    protected String senha;

    public Usuario() {
        nome = "";
        senha = "";
    }


    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
