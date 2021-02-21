package com.example.Mutm.Controller;

import com.example.Mutm.Dao.StaffDao;
import com.example.Mutm.Model.Staff;
import com.example.Mutm.Response.StaffResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@CrossOrigin
@RestController//annotation is used to create RESTful web services using Spring MVC
@RequestMapping("/api")
public class StaffController {
    @Autowired
    private StaffDao dao;

    @GetMapping(path = "/getAllStaff" , produces = "application/json")
    public List<StaffResponse> getAllStaff(){
        return dao.getAllStaff();
    }

    @GetMapping("/getStaffByZones/{zoneid}")
    public List<StaffResponse> getStaffByZones(@PathVariable int zoneid){
        return dao.getStaffByZone(zoneid);
    }

    @PostMapping(path = "/insertStaff", consumes = "application/json", produces = "application/json")
    public List<Staff> insertStaff(@RequestBody Staff staff) throws NoSuchAlgorithmException {
        return dao.insertStaff(staff);
    }

    @PostMapping(path = "/getLoggedIn", consumes = "application/json", produces = "application/json")
    public List<StaffResponse> Login(@RequestBody Staff staff) throws NoSuchAlgorithmException {
        return dao.Login(staff);
    }

    @GetMapping("/")
    public String Welcome(){
        return "welcome to binabuu";
    }
}
