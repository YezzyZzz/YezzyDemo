package com.example.yezzydemo.demo.java8_features;

public class InterfaceDefault {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double sqrt(int x) {
                return Math.sqrt(x);
            }
        };
        System.out.println(formula.add(1,2));
        System.out.println(formula.sqrt(4));
    }
}
