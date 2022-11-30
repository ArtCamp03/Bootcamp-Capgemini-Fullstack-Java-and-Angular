package com.projetono;

public class Main {
    public static void main(String[] args) {
        No<Sting> no1 = new No<>("conteudo No1");

        No<Sting>  no2 = new No<>("conteudo No2");
        no1.setProximoNo(no2);

        No<Sting>  no3 = new No<>("conteudo No3");
        no2.setProximoNo(no3);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());

    }
}
