package com.example.sbjdbc;

import com.example.sbjdbc.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbjdbcApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SbjdbcApplication.class, args);
        Alien obj = context.getBean(Alien.class);
        obj.setId(11);
        obj.setName("Bhavishya");
        obj.setTech("cpp");
    }

}
