package com.dio.exercicios;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Quantidade de números:");
        quantidadeNumeros = scanner.nextInt();

        for (int i = 1; i <= quantidadeNumeros; i++){
            System.out.println("Número " + i + ":");
            numero = scanner.nextInt();

            if(numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;
        }

        System.out.println("Pares:" + quantidadePares);
        System.out.println("Impares:" + quantidadeImpares);
    }
}
