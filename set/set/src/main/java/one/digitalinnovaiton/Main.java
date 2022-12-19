package one.digitalinnovaiton;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Instancia conjunto de carros
        Set<Carro> hashSetCarro = new HashSet<>();

        hashSetCarro.add(new Carro("Ford"));
        hashSetCarro.add(new Carro("Fiat"));
        hashSetCarro.add(new Carro("Geep"));
        hashSetCarro.add(new Carro("Mustang"));

        System.out.println(hashSetCarro);
        System.out.println("\n");

        // organiza em arvore
        Set<Carro> treeSetCarro = new TreeSet<>();

        treeSetCarro.add(new Carro("Ford"));
        treeSetCarro.add(new Carro("Fiat"));
        treeSetCarro.add(new Carro("Geep"));
        treeSetCarro.add(new Carro("Mustang"));
        System.out.println(treeSetCarro);

    }
}
