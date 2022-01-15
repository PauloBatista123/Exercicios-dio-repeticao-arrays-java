package com.dio.list;

import com.dio.queue.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarro = new ArrayList<>();

        listCarro.add(new Carro("ford"));
        listCarro.add(new Carro("gm"));
        listCarro.add(new Carro("fiat"));
        listCarro.add(new Carro("renault"));

        System.out.println(listCarro);

        System.out.println(listCarro.contains(new Carro("ford")));

        System.out.println(listCarro.indexOf(new Carro("gm")));


    }
}
