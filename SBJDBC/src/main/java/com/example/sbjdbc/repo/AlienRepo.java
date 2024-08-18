package com.example.sbjdbc.repo;

import com.example.sbjdbc.model.Alien;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepo {
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien alien){
        String sql = "insert into alien (id, name, tech) values (?, ?, ?)";
        int rowsAffected = template.update(sql, alien.getId(), alien.getName(), alien.getTech());
        System.out.println(rowsAffected+" Rows Affected");
        System.out.println("Data Added...");
    }

    public List<Alien> findall(){
        return new ArrayList<Alien>();
    }
}
