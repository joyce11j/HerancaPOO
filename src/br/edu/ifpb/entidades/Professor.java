package br.edu.ifpb.entidades;

import br.edu.ifpb.sistema.Usuario;

import java.util.List;

public class Professor extends Usuario {

    private List<String> disciplinas;

    public Professor(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public String getNome() {
        return "Sr. " + nome;
    }
}
