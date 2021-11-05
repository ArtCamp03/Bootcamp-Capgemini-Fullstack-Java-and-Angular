package streamapi;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("0","1","3","7","9","6","2","4","5");

        /*
        System.out.println("Imprima todos os elementos dessa lista de strings: ");
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

         */

        // simplificado com lambda
        System.out.println("Imprima todos os elementos dessa lista de strings: ");
        //numerosAleatorios.stream().forEach(s -> System.out.println(s));

        // List ja possui forEach
       // numerosAleatorios.forEach(s -> System.out.println(s));

        // referrence method
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros nº e coloque dentro de um set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // colocar somente dentro do set
        Set<String> collectSet =  numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
                System.out.println("collectSet"+collectSet);

        System.out.println("Transforma lista de string em uma lista de inteiros: ");

        /*
        modo nao usual

         numerosAleatorios.stream()
                .map(new Function<String, Integer>() {

                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                });
         */

        /*
         numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);
         */

       // colocando dentro de uma variavel
        List<Integer> collectList =  numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("collectList"+collectList);

        System.out.println("Pega numeros pares e maiores que 2 e coloca em uma lsita: ");

        /*
        List<Integer> listPares =  numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if( i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());
        System.out.println("listPares"+listPares);

         */

        // modo simplificado
        List<Integer> listPares =  numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
        System.out.println("listPares"+listPares);

        System.out.println("Mostra a media dos numeros: ");

        /*
        Nao usual

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double v) {
                        System.out.println(v);
                    }
                });

         */

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        List<Integer> removeImpares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        /*
        Nao usual

        removeImpares.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if(i %2 != 0) return true;
                return false;
            }
        });

         */

        removeImpares.removeIf(i -> (i %2 != 0));
        System.out.println("removeImpares"+removeImpares);
    }
}
