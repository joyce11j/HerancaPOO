package br.edu.ifpb.entidades.jogo;

public class Arma extends Item {
    private int dano;

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Arma(String nome, int nivel, int dano){
        super(nome, nivel);
        this.dano = dano;
    }

    @Override
    public String toString() {
        // return super.toString() + " (Dano: " + dano + ")";
        return String.format("%s (Dano: %d)", super.toString(), dano);
    }
}
