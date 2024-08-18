package com.example.sbjdbc;

import com.example.sbjdbc.model.Alien;
import com.example.sbjdbc.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbjdbcApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SbjdbcApplication.class, args);
        Alien obj1 = context.getBean(Alien.class);
        obj1.setId(11);
        obj1.setName("Bhavishya");
        obj1.setTech("cpp");


        AlienRepo repo = context.getBean(AlienRepo.class);
        repo.save(obj1);
        System.out.println(repo.findall());

    }

}
