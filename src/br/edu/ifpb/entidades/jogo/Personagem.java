package br.edu.ifpb.entidades.jogo;

public class Personagem {
    private String nome;
    private int vida = 100;
    private int ataque;

    public Personagem(int ataque){
        this.ataque = ataque;
    }

    public void atacar(Personagem outro) {
        outro.sofrerDano(this);
    }

    public void sofrerDano(Personagem atacante) {
        if (vida - atacante.ataque <= 0) {
            System.out.printf("%s morreu!", nome);
            atacante.matar(this);
            vida = 0;
        } else {
            vida -= atacante.ataque;
        }
    }

    public void matar(Personagem outro) {

    }
}
