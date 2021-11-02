package OneDigitalInnovation.interfaces;

public class Programa {
    public static void main(String[] args) {

        final Gol gol = new Gol();
        System.out.println("Marca do Gol: ${gol.marca()}");
        gol.ligar();

        final  Trator trator = new Trator();
        System.out.println("Registro do trator: ${trator.registro()} ");
        trator.ligar();


    }
}
