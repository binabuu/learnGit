package com.example.Mutm.Controller;


import com.example.Mutm.Dao.ZoneDao;
import com.example.Mutm.Response.ZoneResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class ZoneController {

    @Autowired
    private ZoneDao dao;

    @GetMapping(path = "/getAllZone", produces = "application/json")
    public List<ZoneResponse> getAllZone(){
        return dao.getAllZone();
    }
}
