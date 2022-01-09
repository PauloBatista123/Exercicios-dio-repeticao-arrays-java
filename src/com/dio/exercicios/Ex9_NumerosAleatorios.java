package com.dio.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex9_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int[] numerosAleatorios = new int[20];
        int numero;

        for (int i = 0; i < 20; i++){
            numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Aleatorios:");
        for (int num : numerosAleatorios ) {
            System.out.print(num + " ");
        }

        System.out.println("Aleatorios Sucessores:");
        for (int num : numerosAleatorios ) {
            System.out.print(num + 1 + " ");
        }
    }
}
