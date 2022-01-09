package com.dio.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        MeuObj meuObjA = new MeuObj(1);
        MeuObj meuObjB = meuObjA; //atribuindo referencia de memoria

        System.out.println("OBJA:" + meuObjA + " Objb:" + meuObjB);

    }
}
