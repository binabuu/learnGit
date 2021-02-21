package com.example.Mutm.Dao;


import com.example.Mutm.Response.VyanzoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class VyanzoDao {
    @Autowired
    private EntityManager em;

    @Transactional
    @SuppressWarnings("unchecked")
    public List<VyanzoResponse> getAllVyanzo(){
        return em.createNamedStoredProcedureQuery("getAllVyanzos").getResultList();
    }
}
