package com.example.Mutm.Dao;


import com.example.Mutm.Response.SectionResponse;
import com.example.Mutm.Response.ZoneResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class SectionDao {
    @Autowired
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public List<SectionResponse> getAllSection(){
        return em.createNamedStoredProcedureQuery("getAllSections").getResultList();
    }
}
