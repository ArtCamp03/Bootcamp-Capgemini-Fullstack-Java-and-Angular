package ExpressoesLambda;

import java.util.stream.IntStream;

public class Lambda {
    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5,6).forEach(n -> {
            System.out.println(n);
        });

        IntStream.range(0, 3).forEach(n -> {
            System.out.println("Numero: "+n);
        });
    }

}
