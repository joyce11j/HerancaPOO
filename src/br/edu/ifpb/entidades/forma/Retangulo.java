package br.edu.ifpb.entidades.forma;

public class Retangulo extends Forma {
    private double largura;
    private double altura;
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return largura * altura;
    }

    @Override
    public String getNome() {
        return "Retângulo";
    }
}
