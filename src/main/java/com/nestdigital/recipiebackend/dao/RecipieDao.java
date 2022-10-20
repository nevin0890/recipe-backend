package com.nestdigital.recipiebackend.dao;

import com.nestdigital.recipiebackend.model.RecipieModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipieDao extends CrudRepository<RecipieModel, Integer> {

}

