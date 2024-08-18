package com.example.sbjdbc.repo;

import com.example.sbjdbc.model.Alien;
import jdk.jfr.Registered;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepo {
    public void save(Alien alien){
        System.out.println("Data Added...");
    }

    public List<Alien> findall(){
        return new ArrayList<Alien>();
    }
}
