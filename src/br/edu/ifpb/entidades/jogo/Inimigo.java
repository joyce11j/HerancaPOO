package br.edu.ifpb.entidades.jogo;

import java.util.List;

public class Inimigo extends Personagem {
    private List<Item> drop;
    private int premio;

    public Inimigo(List<Item> drop, int premio) {
        super(100);
        this.drop = drop;
        this.premio = premio;
    }

    public List<Item> getDrop() {
        return drop;
    }

    public void setDrop(List<Item> drop) {
        this.drop = drop;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    @Override
    public void matar(Personagem outro) {
        if (outro instanceof Jogador j) {
            j.setExperiencia(0);
            System.out.println(" Game over.");
        }
    }
}
