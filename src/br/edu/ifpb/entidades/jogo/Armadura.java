package br.edu.ifpb.entidades.jogo;

public class Armadura extends Item {

    private int defesa;

    public Armadura(String nome, int nivel) {
        super(nome, nivel);
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

}
