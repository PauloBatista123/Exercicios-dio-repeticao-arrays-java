package com.dio.base;

import java.util.Calendar;
import java.util.Date;

public class Mensagem {

    public void saudacao(int hora){

        if(hora < 12){
            System.out.println("Bom dia...");
        }
        else if (hora < 18){
            System.out.println("Boa tarde..");
        }
        else {
            System.out.println("Boa noite..");
        }
    }
}
