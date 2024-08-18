package org.example;

import Laptop.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1 = (Alien) context.getBean("alien");
        obj1.age=15;
        obj1.printAge();

        Alien obj2 = (Alien) context.getBean("alien");
        obj2.printAge();
    }
}
