package com.example.demospringcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSpringCoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoSpringCoreApplication.class, args);
        ApplicationContext context=new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
        SequenceGenerator generator = context.getBean("sequenceGenerator", SequenceGenerator.class);

        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
    }
}
