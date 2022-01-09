package com.dio.exercicios;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fatororial:");
        int fatorial = scanner.nextInt();
        int resultado = 1;
        ;
        for (int i = fatorial; i >= 1; i--){
            resultado *= i;
            System.out.println("Resultado parcial:" + resultado);
        }

        System.out.println("resultado final:" + resultado);
    }
}
