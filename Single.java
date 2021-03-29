package com.test;

public class Single {
    private static Single single = new Single();
    private Single(){};
    public static Single getIns(){
        return single;
    }
    public void showMessage(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Single single = Single.getIns();
        single.showMessage();
    }
}
