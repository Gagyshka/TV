package com.company;

public class Human {
    public int budget;
    public int mentalBalance = 100;
    public int quantityTV ;

    public int getBudget(int cost) {
        budget = budget - cost;
        return budget;
    }


    public int getBudget1() {
        return budget;
    }

    Human(int budget){
        this.budget = budget;
    }

    public static int changeMentalBalance(int nerves){
        nerves = nerves - 50;
        return nerves;
    }


}
