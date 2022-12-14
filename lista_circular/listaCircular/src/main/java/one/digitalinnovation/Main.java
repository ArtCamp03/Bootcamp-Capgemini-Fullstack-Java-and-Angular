package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        listaCircular<String> minhalsita = new listaCircular<>();
        minhalsita.add("c0");
        minhalsita.add("c1");
        minhalsita.add("c2");
        minhalsita.add("c3");
        minhalsita.add("c4");
        minhalsita.add("c5");

        System.out.println(minhalsita);

        minhalsita.remove(0);
        System.out.println(minhalsita);

        System.out.println(minhalsita.get(0));
    }
}
