package br.edu.ifpb.entidades.jogo;

public class Item {
    private String nome;
    private int nivel;

    public Item(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", nome, nivel);
    }
}
