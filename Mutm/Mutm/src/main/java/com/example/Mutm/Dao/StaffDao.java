package com.example.Mutm.Dao;

import com.example.Mutm.Model.Staff;
import com.example.Mutm.Response.StaffResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Repository // is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
public abstract class StaffDao {
    @Autowired
    private EntityManager em;

    @SuppressWarnings("unchecked")//ignore or suppress compiler warning
    public List<StaffResponse> getAllStaff(){
        return em.createNamedStoredProcedureQuery("getAllStaffs").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<StaffResponse> getStaffByZone(int input){
        return em.createNamedStoredProcedureQuery("getStaffByZones")
                .setParameter("zoneid",input).getResultList();
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<Staff> insertStaff(Staff staff) throws NoSuchAlgorithmException {
        return em.createNamedStoredProcedureQuery("insertStaffs")
                .setParameter("uname",staff.getJinalamatumizi())
                .setParameter("fname",staff.getFirstname())
                .setParameter("mname",staff.getMiddlename())
                .setParameter("lname",staff.getLastname())
                .setParameter("zone",staff.getZoneid())
                .setParameter("sec",staff.getSecid())
                .setParameter("lga",staff.getLgaid())
                .setParameter("status",staff.getStatus())
                .setParameter("phonenumber",staff.getPhonenumber())
                .setParameter("gender",staff.getGender())
                .setParameter("nenolasiri",staff.getNenolasiri())
                .getResultList();
    }


    @Transactional
    @SuppressWarnings("unchecked")
    public List<StaffResponse> Login(Staff staff) throws NoSuchAlgorithmException {
        return em.createNamedStoredProcedureQuery("getLoggedIn")
                .setParameter("uname",staff.getJinalamatumizi())
                .setParameter("password",staff.getNenolasiri())
                .getResultList();
    }

    public abstract StaffResponse findByUsername(String username);
}
