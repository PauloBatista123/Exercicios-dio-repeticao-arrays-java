package com.dio.exercicios;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Numero"+ i + ":");
            numero = scanner.nextInt();
            soma += numero;
            if(numero > maior){
                maior = numero;
            }
        }
        System.out.println("Média:" + (soma / 5));
        System.out.println("Maior:" + maior);

    }
}
