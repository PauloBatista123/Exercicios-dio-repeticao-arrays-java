package com.dio.exercicios;

import java.util.Scanner;

public class Ex1_Nota {
    public static void main(String[] args) {
        int nota = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nota:");
            nota = scanner.nextInt();
            if(nota > 10)
                System.out.println("Nota incorreta... tente entre 0 e 10");
        }while(nota > 10);

        System.out.println("Obrigado!!");

    }
}
