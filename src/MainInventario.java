import br.edu.ifpb.entidades.jogo.Arma;
import br.edu.ifpb.entidades.jogo.Armadura;
import br.edu.ifpb.entidades.jogo.Pocao;
import br.edu.ifpb.sistema.Inventario;

public class MainInventario {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.addItem(new Arma("Faca", 1, 2));
        inv.addItem(new Arma("Pistola", 2, 4));
        inv.addItem(new Arma("Bastão", 1, 21));

        inv.addItem(new Armadura("Colete", 1));
        inv.addItem(new Armadura("Escudo", 1));
        inv.addItem(new Armadura("Armadura de ferro", 3));

        inv.addItem(new Pocao("Poção de vida menor"));
        inv.addItem(new Pocao("Poção de vida média"));

        inv.exibirItens();
    }
}
