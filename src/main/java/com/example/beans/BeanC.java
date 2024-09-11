package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
    private final BeanA beanA;
    public BeanC(BeanA beanA) {
        this.beanA = beanA;
    }

    public void print(){
        System.out.println("I am BeanC");
    }
}
