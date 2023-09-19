package com.example.yezzydemo.demo.java8_features;

public class Java8Features {

    public static void main(String[] args) {
        interfaceDefault();
    }

    public static void interfaceDefault(){
        Formula formula = new Formula() {
            @Override
            public double sqrt(int x) {
                return Math.sqrt(x);
            }
        };
        System.out.println("The res of default method:" + formula.add(1,1));
        System.out.println("The res of designed method:" + formula.sqrt(16));

    }

}
