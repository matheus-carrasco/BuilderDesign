package com.finan.orcamento.model;

public class Casa2Quartos implements BuilderCasa{
    Casa casa = new Casa();

    public Casa2Quartos(){
        casa = new Casa(2,1,false);
    }

    @Override
    public void buildQuartos() {
        System.out.println("Um quarto 2,50 x 1,90m e outro 2,30 x 1,80m");
    }

    @Override
    public void buildBanheiros() {
        System.out.println("Banheiro 2,30 x 1,25m");
    }

    @Override
    public void buildChurrasqueira() {
        System.out.println("Sem churrasqueira");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}
