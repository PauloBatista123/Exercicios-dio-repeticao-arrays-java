package com.dio.exercicios;

import java.util.Scanner;

public class Ex8_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        String caracter;

        for (int i = 0; i <= 5; i++){
            System.out.println("Digite o caracter:");
            caracter = scan.next();
            switch (caracter){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
                default:
                    consoantes[i] = caracter;
                    quantidadeConsoantes++;
                    break;
            }
        }

        System.out.println("Quantidade de consoantes:" + quantidadeConsoantes);
        for (String consoante: consoantes) {
            if(consoante != null)
                System.out.println("Consoante:" + consoante);
        }
    }
}
