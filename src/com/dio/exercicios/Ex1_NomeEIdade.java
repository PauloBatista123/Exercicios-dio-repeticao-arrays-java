package com.dio.exercicios;

import java.util.Objects;
import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = null;
        int idade;

        while(!Objects.equals(nome, "0")){
            System.out.println("Digite o nome:");
            nome = scanner.next();
            System.out.println("Digite a idade:");
            idade = scanner.nextInt();
        }
        System.out.println("Finalizado");
    }
}
