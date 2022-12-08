package com.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEnc = new ListaEncadeada<>();

        minhaListaEnc.add("primeiro");
        minhaListaEnc.add("segundo");
        minhaListaEnc.add("terceiro");
        minhaListaEnc.add("quarto");
        minhaListaEnc.add("quinto");

        System.out.println(minhaListaEnc.get(0));
        System.out.println(minhaListaEnc.get(1));
        System.out.println(minhaListaEnc.get(2));
        System.out.println(minhaListaEnc.get(3));

        System.out.println(minhaListaEnc);

        System.out.println(minhaListaEnc.remove(2));

        System.out.println(minhaListaEnc);

    }
}
