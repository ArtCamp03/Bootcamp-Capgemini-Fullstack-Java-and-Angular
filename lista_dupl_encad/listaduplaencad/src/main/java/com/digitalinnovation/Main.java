package com.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhalistaEnc = new ListaDuplamenteEncadeada<>();

        minhalistaEnc.add("C1");
        minhalistaEnc.add("C2");
        minhalistaEnc.add("C3");
        minhalistaEnc.add("C4");
        minhalistaEnc.add("C5");
        minhalistaEnc.add("C6");
        minhalistaEnc.add("C7");

        System.out.println(minhalistaEnc);

        minhalistaEnc.remove(3);
        minhalistaEnc.add(3, "99");

        System.out.println(minhalistaEnc);
        System.out.println(minhalistaEnc.get(3));
    }
}
