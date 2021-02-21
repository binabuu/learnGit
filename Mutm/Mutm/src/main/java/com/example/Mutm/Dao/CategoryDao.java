package com.example.Mutm.Dao;


import com.example.Mutm.Response.CategoryResponse;
import com.example.Mutm.Response.StaffResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CategoryDao {
    @Autowired
    private EntityManager em;

    @Transactional
    @SuppressWarnings("unchecked")
    public List<CategoryResponse> getAllVyazoCategories(){
        return em.createNamedStoredProcedureQuery("getAllVyanzoCategories").getResultList();
    }
}
