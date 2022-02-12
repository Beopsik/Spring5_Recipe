package com.example.demospringcore;

import com.example.demospringcore.Sequence.SequenceDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoSpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.example.demospringcore");

        SequenceDao sequenceDao = context.getBean(SequenceDao.class);

        System.out.println(context.containsBean("testDao"));
        System.out.println(context.containsBean("testDto"));
        System.out.println(sequenceDao.getNextValue("IT"));
        System.out.println(sequenceDao.getNextValue("IT"));
    }
}
