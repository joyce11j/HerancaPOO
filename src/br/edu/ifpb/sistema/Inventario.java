package br.edu.ifpb.sistema;

import br.edu.ifpb.entidades.jogo.Arma;
import br.edu.ifpb.entidades.jogo.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Item> itens = new ArrayList<>();

    public void addItem(Item i) {
        itens.add(i);

    }

    public void exibirItens() {
        for(Item i : itens) {
            if (i instanceof Arma a) {
                System.out.println(a.getDano());
            }
        }
    }
}
