package com.example.Mutm.Controller;


import com.example.Mutm.Dao.SectionDao;
import com.example.Mutm.Response.SectionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SectionController {
    @Autowired
    private SectionDao dao;

    @GetMapping(path = "/getAllSection", produces = "application/json")
    public List<SectionResponse> getAllSection(){
        return dao.getAllSection();
    }
}
