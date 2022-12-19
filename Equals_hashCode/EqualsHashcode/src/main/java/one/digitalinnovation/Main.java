package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Audi"));

        System.out.println(listCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());

        System.out.println(listCarros.contains(new Carro("Subaro")));


    }


}
