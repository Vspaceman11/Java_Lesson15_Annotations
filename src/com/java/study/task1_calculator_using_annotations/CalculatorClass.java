package com.java.study.task1_calculator_using_annotations;

public class CalculatorClass {

/*
* Method print sum of num1 and num2
* @param num1 number 1
* @param num2 number 2
* */
    @Calculator(num1 = 10,num2 = 25.5)
    public void mathAdd(double num1, double num2){
        System.out.println(num1 + num2);
    }
}
