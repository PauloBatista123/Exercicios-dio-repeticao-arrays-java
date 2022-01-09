package com.dio.base;

public class Emprestimo {

    public static double getTaxaDuasParcelas(){
        return 0.33;
    }
    public static double getTaxaTresParcelas(){
        return 0.89;
    }

    public static void calcular(double valor, int parcelas){

        if(parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final:" + valorFinal);
        }else if(parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final:" + valorFinal);
        }else{
            System.out.println("Não aceitamos a quantidade informada");
        }
    }
}
