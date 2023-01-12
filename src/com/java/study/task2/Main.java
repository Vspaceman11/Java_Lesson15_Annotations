package com.java.study.task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.printNewWord();
        Class<?> aClass = A.class;
        try {
            Field field = aClass.getDeclaredField("word");
            MyWord myWord = field.getAnnotation(MyWord.class);
            System.out.println(myWord.word());
        } catch (NoSuchFieldException e){
            e.printStackTrace();
        }
    }
}
