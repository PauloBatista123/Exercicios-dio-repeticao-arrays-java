package com.dio.listaduplamenteencadeada;

import com.dio.listaencadeada.ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");

        System.out.println(minhaLista);

        minhaLista.remove(3);

        minhaLista.add("c987");

        System.out.println(minhaLista);

        minhaLista.add(3, "addindex");

        System.out.println(minhaLista);

    }
}
