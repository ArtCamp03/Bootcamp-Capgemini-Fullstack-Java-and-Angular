package OneDigitalInnovation.classes.usuario;

public class ProgramaSuperUsuario {

    public static void main(String[] args) {

        final var SuperUsuario = new SuperUsuario("root","123");
        SuperUsuario.getLogin();
        SuperUsuario.getSenha();

        String root = SuperUsuario.nome;
    }
}
