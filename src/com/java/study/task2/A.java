package com.java.study.task2;

import java.lang.annotation.*;

public class A {
    public void printNewWord(){
        System.out.println("Hello form A");
    }
@MyWord
    String word;
}
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
@Inherited
@interface MyWord{
    public String word() default "Hello";
}
