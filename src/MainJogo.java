import br.edu.ifpb.entidades.jogo.*;

import java.util.Arrays;

public class MainJogo {
    public static void main(String[] args) {
        Item i1 = new Arma("Faca", 1, 5);
        Item i2 = new Pocao("Poção de vida menor");

        Jogador j1 = new Jogador(100, 90);
        Inimigo inimigo = new Inimigo(Arrays.asList(i1, i2), 50);

        //j1.atacar(inimigo);
        inimigo.atacar(j1);



    }
}
