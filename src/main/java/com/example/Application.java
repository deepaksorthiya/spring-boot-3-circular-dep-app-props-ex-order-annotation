package com.example;

import com.example.beans.BeanC;
import com.example.configprops.DatabaseProperties;
import com.example.orderannotation.Rating;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@EnableConfigurationProperties(DatabaseProperties.class)
public class Application implements ApplicationRunner {

    private final BeanC beanC;
    @Value("${my.secret:DEFAULT_SECRET}")
    private String secret;
    private final List<Rating> ratings;
    private final DatabaseProperties databaseProperties;

    private final Map<String, String> simpleMap;
    private final Map<String, List<String>> arrayMap;

    public Application(BeanC beanC, List<Rating> ratings, DatabaseProperties databaseProperties,
                       @Value("#{${app.simple.map:{:}}}") Map<String, String> simpleMap,
                       @Value("#{${app.array.map:{:}}}") Map<String, List<String>> arrayMap) {
        this.beanC = beanC;
        this.ratings = ratings;
        this.databaseProperties = databaseProperties;
        this.simpleMap = simpleMap;
        this.arrayMap = arrayMap;
    }


    public static void main(String[] args) {
        //System.setProperty("my.secret", "SYS_SECRET_FROM_MAIN_JAVA");
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("My Secret :: " + secret);
        beanC.print();
        System.out.println("Application started with command-line arguments :: " + Arrays.toString(args.getSourceArgs()));
        System.out.println("NonOptionArgs :: " + args.getNonOptionArgs());
        System.out.println("OptionNames :: " + args.getOptionNames());
        System.out.println(ratings);
        System.out.println(simpleMap);
        System.out.println(arrayMap);
        System.out.println(databaseProperties);
    }
}
