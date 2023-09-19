package com.example.yezzydemo.demo.java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.stream().filter(element -> element>3).collect(Collectors.toList()));
    }
}
