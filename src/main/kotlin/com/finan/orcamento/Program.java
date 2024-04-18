package com.finan.orcamento;

import com.finan.orcamento.model.Casa2Quartos;
import com.finan.orcamento.model.BuilderCasa;
import com.finan.orcamento.model.Casa;
import com.finan.orcamento.model.Casa2Quartos2BanheiroChurrasqueira;

import java.util.Locale;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        BuilderCasa builderCasa1 = new Casa2Quartos();
        builderCasa1.buildQuartos();
        builderCasa1.buildBanheiros();
        builderCasa1.buildChurrasqueira();
        Casa casa1 = builderCasa1.getCasa();

        System.out.println("Casa 1:");
        System.out.println("Quartos: " + casa1.getQuartos());
        System.out.println("Banheiros: " + casa1.getBanheiros());
        System.out.println("Churrasqueira: " + casa1.isChurrasqueira());

        System.out.println("--------------------------------------------");

        BuilderCasa builderCasa2 = new Casa2Quartos2BanheiroChurrasqueira();
        builderCasa2.buildQuartos();
        builderCasa2.buildBanheiros();
        builderCasa2.buildChurrasqueira();
        Casa casa2 = builderCasa2.getCasa();

        System.out.println("Casa 2:");
        System.out.println("Quartos: " + casa2.getQuartos());
        System.out.println("Banheiros: " + casa2.getBanheiros());
        System.out.println("Churrasqueira: " + casa2.isChurrasqueira());
    }
}
