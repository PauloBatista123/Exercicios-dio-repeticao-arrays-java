package com.dio.base;

public class Calculadora {

    public void soma(int valor1, int valor2){

        int soma = valor1 + valor2;

        System.out.println("Soma:" + soma);
    }
    public void subtrair(int valor1, int valor2){

        int subtracao = valor1 - valor2;

        System.out.println("Subtrair:" + subtracao);
    }

    public void multiplicar(int valor1, int valor2){

        int multiplicacao = valor1 * valor2;

        System.out.println("Multiplicação:" + multiplicacao);
    }

    public void divisao(int valor1, int valor2){

        int dividir = valor1 / valor2;

        System.out.println("Divisão:" + dividir);
    }

}
