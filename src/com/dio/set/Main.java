package com.dio.set;

import com.dio.queue.Carro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hash = new HashSet<>();

        hash.add(new Carro("ford"));
        hash.add(new Carro("gm"));
        hash.add(new Carro("renault"));
        hash.add(new Carro("fiat"));

        System.out.println(hash);

        Set<Carro> tree = new TreeSet<>();

        tree.add(new Carro("ford"));
        tree.add(new Carro("gm"));
        tree.add(new Carro("renault"));
        tree.add(new Carro("fiat"));
    }
}
