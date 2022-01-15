package com.dio.listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");

        System.out.println(minhaLista);

        minhaLista.add("c8");

        System.out.println(minhaLista);
    }
}
