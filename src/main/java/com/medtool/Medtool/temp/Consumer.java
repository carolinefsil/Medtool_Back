package com.medtool.Medtool.temp;

import org.springframework.jms.annotation.JmsListener;

public class Consumer {


    @JmsListener(destination = "xuplanozes@gmail.com")
    public void listener1(String msg){
        System.out.println("Received Message1 : "+"Olá estou funcionando!");
    }


}

