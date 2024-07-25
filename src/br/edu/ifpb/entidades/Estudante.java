package br.edu.ifpb.entidades;

import br.edu.ifpb.sistema.Usuario;

public class Estudante extends Usuario {

    private double media;

    public double calcularMedia(double n1, double n2){
        return (n1 + n2)/2;
    }

    public Estudante(String nome, String senha) {
        // não pode ter código aqui
        super(nome, senha);
        media = 0.0;
    }
}
