package com.example.Mutm.Controller;

import com.example.Mutm.Dao.LgaDao;
import com.example.Mutm.Response.LgaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class LgaController {

    @Autowired
    private LgaDao dao;

    @GetMapping(path = "/getAllLga" , produces = "application/json")
    public List<LgaResponse> getAllLga(){
        return dao.getAllLga();
    }
}
