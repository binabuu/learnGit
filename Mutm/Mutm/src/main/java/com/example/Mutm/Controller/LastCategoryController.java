package com.example.Mutm.Controller;


import com.example.Mutm.Dao.LastCategoryDao;
import com.example.Mutm.Response.LastCategoryResponse;
import com.example.Mutm.Response.StaffResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
public class LastCategoryController {
    @Autowired
    private LastCategoryDao dao;


    @GetMapping(path = "/getAllLastCategories", produces = "application/json")
    public List<LastCategoryResponse> getAllLastCategory(){
        return dao.getAllLastCategory();
    }

}
