package com.java.study.task1_calculator_using_annotations;

import java.lang.annotation.*;

/*
* Annotation with to param:
* @param num1
* @param num2
*
* */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Calculator {
    double num1() default 0;
    double num2() default 0;
}
