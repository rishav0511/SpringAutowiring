package com.rishav.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/rishav/autowiring/beans.xml");
//        System.out.println("beans.xml loaded");
        Human human = context.getBean("human",Human.class);
        human.startPumping();
    }
}
