package com.dio.listaencadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        minhaLista.add("1d");
        minhaLista.add("2d");
        minhaLista.add("3d");
        minhaLista.add("4d");
        minhaLista.add("5d");

        System.out.println(minhaLista.remove(3));
        System.out.println(minhaLista);
    }
}
