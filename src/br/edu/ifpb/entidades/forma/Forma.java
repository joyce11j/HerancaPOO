package br.edu.ifpb.entidades.forma;

public abstract class Forma {

    public abstract String getNome();
    public abstract double getArea();


    @Override
    public String toString() {
        return String.format("%s de área %.2f", getNome(), getArea());
    }
    // NOME_FORMA de área 1,23 (limite a duas casas decimais)
}
