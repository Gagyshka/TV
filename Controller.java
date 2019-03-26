package com.company;

public class Controller {
    public int button2;
    public int button3;
    public int button4;
    public int button5;
    public int button6;
    public int button7;
    public int button8;

    public static void turnOn(){
        System.out.println("TV ON");

    }
    public static void turnOff(){

        System.out.println("TV OFF");
    }
    public static void turnUpChannels(int channel){

        System.out.println("Is active channel " + channel);

    }
    public static void turnDownChannels(int channel){

        System.out.println("Is active channel " + channel);

    }
    Controller( int button2, int button3, int button4){
        this.button2 = button2;
        this.button3 = button3;
        this.button4 = button4;
    }

    Controller(int button5,int button6,int button7, int button8){
        this.button5 = button5;
        this.button6 = button6;
        this.button7 = button7;
        this.button8 = button8;
    }






}
