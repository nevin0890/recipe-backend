package com.nestdigital.recipiebackend.controller;

import com.nestdigital.recipiebackend.dao.RecipieDao;
import com.nestdigital.recipiebackend.model.RecipieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipieController {

    @Autowired
    private RecipieDao Dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addrecipie",consumes = "application/json",produces = "application/json")
    public String addrecipie(@RequestBody RecipieModel recipie) {
        System.out.println(recipie.toString());
        Dao.save(recipie);
        return "{status:success}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getrecipie")
    public List<RecipieModel> getRecipie() {
        return (List<RecipieModel> )Dao.findAll();
    }
}
