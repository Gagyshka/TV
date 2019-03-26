package com.company;

public class Provider {//добавить сюда пакеты каналов что бы  будующем реализовать покупку пакетов пользователем
    public int[] package1 = {1,2,3};
    public boolean packageOne = true;
    public int package1Cost = 100;
    public int[] package2 = {7,8,10};
    public boolean packadeTwo = false;
    public int package2Cost = 200;


    public static int givePackage1(int budget, int package1Cost){ //снятие суммы за услуги провайдера у пользователя
        int newBudget;
        newBudget = budget - package1Cost;
        return newBudget;
    }
    public static int givePackage2(int budget, int package2Cost){ //снятие суммы за услуги провайдера у пользователя
        int newBudget;
        newBudget = budget - package2Cost;
        return newBudget;
    }
}
