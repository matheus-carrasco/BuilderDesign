package com.finan.orcamento.model;

public class Casa2Quartos2BanheiroChurrasqueira implements BuilderCasa{
    Casa casa = new Casa();

    public Casa2Quartos2BanheiroChurrasqueira(){
        casa = new Casa(2,2,true);
    }

    @Override
    public void buildQuartos() {
        System.out.println("Um quarto 2,50 x 1,90m e outro 2,30 x 1,80m");
    }

    @Override
    public void buildBanheiros() {
        System.out.println("2 banheiros 2,30 x 1,25m");
    }

    @Override
    public void buildChurrasqueira() {
        System.out.println("Com churrasqueira");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}
