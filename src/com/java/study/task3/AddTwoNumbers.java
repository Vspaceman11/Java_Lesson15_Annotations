package com.java.study.task3;

public class AddTwoNumbers {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
