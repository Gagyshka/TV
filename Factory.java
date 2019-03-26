package com.company;

public class Factory {
    public static TV createTv(){
        TV tv = new TV("SONY","Black",40,true,1000);
        return tv;
    }
    public static TV changeTv(TV tv){
        TV tv1 = tv;
        return tv1;
    }
}
