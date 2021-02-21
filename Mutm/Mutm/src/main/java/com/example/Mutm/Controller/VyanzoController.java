package com.example.Mutm.Controller;

import com.example.Mutm.Dao.VyanzoDao;
import com.example.Mutm.Response.VyanzoResponse;
import com.example.Mutm.Response.ZoneResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class VyanzoController {

    @Autowired
    private VyanzoDao dao;

    @PostMapping(path = "/getAllVyanzo", produces = "application/json")
    public List<VyanzoResponse> getAllVyanzo(){
        return dao.getAllVyanzo();
    }
}
