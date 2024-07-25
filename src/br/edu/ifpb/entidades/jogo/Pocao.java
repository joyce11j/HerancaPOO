package br.edu.ifpb.entidades.jogo;

import br.edu.ifpb.entidades.jogo.Item;

public class Pocao extends Item {

    private int vida;

    public Pocao(String nome) {
        super(nome, 1);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
