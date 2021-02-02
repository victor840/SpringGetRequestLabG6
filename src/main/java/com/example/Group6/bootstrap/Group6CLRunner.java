package com.example.Group6.bootstrap;

import com.example.Group6.domain.Name;
import com.example.Group6.repos.NameRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Group6CLRunner implements CommandLineRunner {

    private final NameRepo nameRepo;

    public Group6CLRunner(NameRepo nameRepo) {
        this.nameRepo = nameRepo;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting Spring");

        Name group6 = new Name();
        group6.setFirstName("The name's 6....Group 6");
        group6.setLastName("006");
        nameRepo.save(group6);


    }
}
