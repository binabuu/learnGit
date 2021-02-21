package com.example.Mutm.Dao;

import com.example.Mutm.Response.ZoneResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ZoneDao {
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    public List<ZoneResponse> getAllZone(){
        return em.createNamedStoredProcedureQuery("getAllZones").getResultList();
    }
}
