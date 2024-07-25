package br.edu.ifpb.entidades.jogo;

import br.edu.ifpb.sistema.Inventario;

public class Jogador extends Personagem {
    private Armadura armadura;
    private int experiencia;
    private Inventario inventario;

    public Jogador(int experiencia, int ataque) {
        super(ataque);
        this.experiencia = experiencia;
        this.inventario = new Inventario();
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public void matar(Personagem outro) {
        if (outro instanceof Inimigo i) {
            i.getDrop().forEach(inventario::addItem);
            experiencia += i.getPremio();
        }
    }
}
