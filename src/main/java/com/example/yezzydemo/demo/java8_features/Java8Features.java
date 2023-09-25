package com.example.yezzydemo.demo.java8_features;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;


public class Java8Features {
    static final StudentProvider provider = (age,name)->{
        return new Student(age,name);
    };

    static final StudentProvider provider2 = Student::new;

    public static void main(String[] args) {
        interfaceDefault();
        lambdaTest();
        functionalInterface();
        builtInFunctional();
        optionalTest();
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

    public static void lambdaTest(){
        List<String> nameList = Arrays.asList("zzz","mike","ssss");
        nameList.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(nameList);
    }

    public static void functionalInterface(){
        Student student = provider.build(3,"mike");
        System.out.println(student.age);
        System.out.println(student.name);
        Student student2 = provider2.build(4,"jack");
        System.out.println(student2.age);
        System.out.println(student2.name);
    }

    public static void builtInFunctional(){
        //consumer
        List<String> list = Arrays.asList("a","b","c");
        list.forEach(ele -> System.out.println(ele));
        //supplier
        Supplier<LocalDate> supplier = LocalDate::now;
        LocalDate currentDate = supplier.get();
        System.out.println(currentDate);
        //function
        Function<String,Integer> function = s -> Integer.parseInt(s);
        System.out.println(function.apply("123"));
    }

    public static void optionalTest(){
        Map<String,String> map = new HashMap<>();
        map.put("hello","s");
        String name = Optional.ofNullable(map)
                .map(m -> m.get("hello")).orElse(null);
        System.out.println(name);

    }



}
