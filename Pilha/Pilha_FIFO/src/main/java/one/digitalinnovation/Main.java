package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        Pilha minhaPinlha = new Pilha();

        minhaPinlha.push(new No(1));
        minhaPinlha.push(new No(2));
        minhaPinlha.push(new No(3));
        minhaPinlha.push(new No(4));
        minhaPinlha.push(new No(5));
        minhaPinlha.push(new No(6));

        System.out.println(minhaPinlha);

        System.out.println(minhaPinlha.pop());

        System.out.println(minhaPinlha);
    }
}
