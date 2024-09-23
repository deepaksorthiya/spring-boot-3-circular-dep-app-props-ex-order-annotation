package com.example;

import com.example.beans.BeanC;
import com.example.orderannotation.Rating;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application implements ApplicationRunner {

    private final BeanC beanC;
    @Value("${my.secret:DEFAULT_SECRET}")
    private String secret;
    private final List<Rating> ratings;

    public Application(BeanC beanC, List<Rating> ratings) {
        this.beanC = beanC;
        this.ratings = ratings;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(secret);
        beanC.print();
        System.out.println("Application started with command-line arguments: " + Arrays.toString(args.getSourceArgs()));
        System.out.println("NonOptionArgs: " + args.getNonOptionArgs());
        System.out.println("OptionNames: " + args.getOptionNames());
        System.out.println(ratings);
    }
}
