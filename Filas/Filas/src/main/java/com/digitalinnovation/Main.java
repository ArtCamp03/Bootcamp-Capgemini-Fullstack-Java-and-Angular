package com.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue( "primeiro");
        minhaFila.enqueue( "segundo");
        minhaFila.enqueue( "terceiro");
        minhaFila.enqueue( "quarto");
        minhaFila.enqueue( "quinto");

        System.out.println(minhaFila);

        // recupera o primerio elemento da fila
        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);
        minhaFila.enqueue( "ultimo");
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }
}
