package com.example.Group6.controller;

import com.example.Group6.domain.Name;
import com.example.Group6.repos.NameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NameController {

    private final NameRepo nameRepo;

    @Autowired
    public NameController(NameRepo nameRepo) {
        this.nameRepo = nameRepo;
    }


    @RequestMapping("/Group6")

    public Name getFirstName(){
        return nameRepo.findById(1l).get();
    }

    @RequestMapping("/ex/name")
    @ResponseBody
    public String getLastName(){
        return "Lastname";
    }

}
