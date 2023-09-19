package com.example.yezzydemo.demo.java8_features;

public interface Formula {
    double sqrt(int x);

    default int add(int x,int y){
        return x+y;
    }


}
