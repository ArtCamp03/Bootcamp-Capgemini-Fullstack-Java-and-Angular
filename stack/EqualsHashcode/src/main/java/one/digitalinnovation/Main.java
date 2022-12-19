package one.digitalinnovation;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCArros = new Stack<>();

        stackCArros.push(new Carro("Ford"));
        stackCArros.push(new Carro("Chevrolet"));
        stackCArros.push(new Carro("Fiat"));
        stackCArros.push(new Carro("Honda"));

        System.out.println(stackCArros);
    }
}
