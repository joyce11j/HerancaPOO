import br.edu.ifpb.entidades.Estudante;
import br.edu.ifpb.entidades.Professor;
import br.edu.ifpb.sistema.Usuario;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Usuario u1 = new Estudante("Joao", "1234");
        Usuario u2 = new Estudante("Jose", "12345234");
        Usuario u3 = new Professor("Maria", "123");
        Usuario u4 = new Professor("Pedro", "41231567");

        List<Usuario> usuarios = Arrays.asList(u1, u2, u3, u4);

        boolean res = usuarios.stream().anyMatch(u -> u.getSenha().length() <= 4);
        System.out.println("Há usuários com senha fraca? " + res);

        usuarios.stream().forEach(System.out::println);
    }
}
