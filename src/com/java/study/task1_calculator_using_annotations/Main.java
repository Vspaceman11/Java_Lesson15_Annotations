package com.java.study.task1_calculator_using_annotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        CalculatorClass calc = new CalculatorClass();
        Class<?>cl = CalculatorClass.class;
        try {
            Method m = cl.getDeclaredMethod("mathAdd", double.class, double.class);
            Calculator calculator = m.getAnnotation(Calculator.class);
            calc.mathAdd(calculator.num1(), calculator.num2());
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
