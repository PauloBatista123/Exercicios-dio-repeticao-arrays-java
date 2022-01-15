package com.dio.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarro = new LinkedList<>();

        queueCarro.add(new Carro("ford"));
        queueCarro.add(new Carro("gm"));
        queueCarro.add(new Carro("fiat"));

        System.out.println(queueCarro);

        System.out.println(queueCarro.offer(new Carro("Renault")));//tenta adicionar e retornar false caso não consiga
        System.out.println(queueCarro.peek());
    }
}
