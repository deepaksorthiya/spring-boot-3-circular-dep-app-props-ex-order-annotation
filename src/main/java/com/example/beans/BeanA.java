package com.example.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private final BeanB beanB;

    public BeanA(@Lazy BeanB beanB) {
        this.beanB = beanB;
    }

    public void printA() {
        System.out.println("I am BeanA");
    }
}