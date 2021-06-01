package com.gurov.lesson2.task4;

public class Pizza {

    private String name;
    private boolean spicy;
    private int price;

    public Pizza(String name,boolean spicy,int price){

        this.name = name;
        this.spicy = spicy;
        this.price = price;
    }

    public String getName(){return name;}

    public boolean getSpicy(){return spicy;}

    public int getPrice(){return price;}
}
