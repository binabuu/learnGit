package com.example.Mutm.Dao;

import com.example.Mutm.Response.LgaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class LgaDao {
    @Autowired
    private EntityManager em;

    @Transactional
    @SuppressWarnings("unchecked")
    public List<LgaResponse> getAllLga(){
        return em.createNamedStoredProcedureQuery("getAllLgas").getResultList();
    }
}
