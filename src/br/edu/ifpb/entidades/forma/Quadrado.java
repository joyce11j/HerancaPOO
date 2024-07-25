package br.edu.ifpb.entidades.forma;


public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }
}
