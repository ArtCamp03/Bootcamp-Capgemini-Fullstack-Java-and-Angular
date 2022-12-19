package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarro = new LinkedList<>();

        queueCarro.add(new Carro ("Ford"));
        queueCarro.add(new Carro ("Chevrolet"));
        queueCarro.add(new Carro ("Fiat"));

        System.out.println(queueCarro);

        // add -> retorna ERRO senao for possivel adicionar
        System.out.println(queueCarro.add(new Carro("Pejout")));
        System.out.println(queueCarro);

        // often -> retorna FALSE senao for possivel adicionar
        System.out.println(queueCarro.offer(new Carro("Pejout")));
        System.out.println(queueCarro);

        // peek -> retorna a cabeça dafila, e se estiver vazia retorna NULL
        System.out.println(queueCarro.peek());
        System.out.println(queueCarro);

        // poll -> retorna a cabeça dafila, e remove o elemento
        System.out.println(queueCarro.poll());
        System.out.println(queueCarro);

        // verifica se a fila esta vazia
        System.out.println(queueCarro.isEmpty());

        // verifica o tamanho da fila
        System.out.println(queueCarro.size());
    }
}
