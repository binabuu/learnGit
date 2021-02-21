package com.example.Mutm.Dao;


import com.example.Mutm.Response.CategoryResponse;
import com.example.Mutm.Response.LastCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class LastCategoryDao {
    @Autowired
    private EntityManager em;

    @Transactional
    @SuppressWarnings("unchecked")
    public List<LastCategoryResponse> getAllLastCategory(){
        return em.createNamedStoredProcedureQuery("getAllLastCategories").getResultList();
    }
}
