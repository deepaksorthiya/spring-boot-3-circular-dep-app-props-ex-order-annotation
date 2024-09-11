package com.example.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private final BeanA beanA;

    public BeanB(@Lazy BeanA beanA) {
        this.beanA = beanA;
    }


    public void printB() {
        System.out.println("I am BeanB");
    }
}