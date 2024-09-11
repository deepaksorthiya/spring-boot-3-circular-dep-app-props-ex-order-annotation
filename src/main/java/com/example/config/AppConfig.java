//package com.example.config;
//
//import com.example.beans.BeanA;
//import com.example.beans.BeanB;
//import com.example.beans.BeanC;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;
//
///**
// * comment @Component in classes {@link BeanA } {@link BeanB} @{@link BeanC}
// * to test this
// */
//@Configuration
//public class AppConfig {
//
//    @Bean
//    public BeanA beanA(@Lazy BeanB beanB) {
//        return new BeanA(beanB);
//    }
//
//    @Bean
//    public BeanB beanB(@Lazy BeanA beanA) {
//        return new BeanB(beanA);
//    }
//
//    @Bean
//    public BeanC beanC(@Lazy BeanA beanA) {
//        return new BeanC(beanA);
//    }
//}
