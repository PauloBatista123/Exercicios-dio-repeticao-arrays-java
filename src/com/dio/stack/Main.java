package com.dio.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarro = new Stack<>();

        stackCarro.push(new Carro("ford"));
        stackCarro.push(new Carro("fiat"));
        stackCarro.push(new Carro("GM"));

        System.out.println(stackCarro);


    }
}
