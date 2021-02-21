package com.example.Mutm.Response;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;

@Entity
@Data

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name="getAllLastCategories",procedureName = "getAllLastCategory",
                resultClasses = LastCategoryResponse.class)
})
public class LastCategoryResponse {
    @Id
    int lcid;
    String lcname;
    int price;
    String catname;
    String status;
    String condision;
}
