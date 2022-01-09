package com.dio.exercicios;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Digite o número da tabuada:");
        numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + ": " + (numero * i));
        }
    }
}
