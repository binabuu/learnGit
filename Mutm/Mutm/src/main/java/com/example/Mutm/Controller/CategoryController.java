package com.example.Mutm.Controller;

import com.example.Mutm.Dao.CategoryDao;
import com.example.Mutm.Response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
public class CategoryController {

    @Autowired
    private CategoryDao dao;

    @PostMapping(path = "/getAllVyanzoCategories", produces = "application/json")
    public List<CategoryResponse> getAllVyanzoCategory(){
        return dao.getAllVyazoCategories();
    }
}
