package com.gurov.lesson2.task4;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMenu {

    public static void main(String[] args){

        LinkedListMenu app = new LinkedListMenu();
        app.Menu();
    }

    public static void Menu(){

        LinkedList<Pizza> listPizza = new LinkedList<Pizza>();
        listPizza.add(new Pizza("Hawaiian",true,395));
        listPizza.add(new Pizza("Hawaiian",false,385));
        listPizza.add(new Pizza("Pepperoni",true,245));
        listPizza.add(new Pizza("Pepperoni",false,240));
        listPizza.add(new Pizza("Cheesy",true,245));
        listPizza.add(new Pizza("Cheesy",false,235));
        listPizza.add(new Pizza("Margaret",true,345));
        listPizza.add(new Pizza("Margaret",false,330));
        listPizza.add(new Pizza("Caesar",true,375));
        listPizza.add(new Pizza("Caesar",false,370));
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the maximum price: ");
            int maxPrice = in.nextInt();
            if (maxPrice < 0)
                throw new Exception("Wrong! The price cannot be negative");
            listPizza.removeIf(itemList -> itemList.getPrice() > maxPrice);//if price > maximum then Delete item in list
            DisplayList(listPizza);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void DisplayList(LinkedList<Pizza> listPizza){

        for (Pizza itemList : listPizza){
            if (itemList.getSpicy())
                System.out.printf("Pizza %s spicy price %d\n",itemList.getName(),itemList.getPrice());
            else
                System.out.printf("Pizza %s not spicy price %d\n",itemList.getName(),itemList.getPrice());
        }
    }

}
