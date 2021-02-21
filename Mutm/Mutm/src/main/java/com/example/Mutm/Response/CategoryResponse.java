package com.example.Mutm.Response;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;

@Entity
@Data
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name="getAllVyanzoCategories",procedureName = "getAllVyanzoCategory",
                resultClasses = CategoryResponse.class)
})
public class CategoryResponse {
    @Id
    int catid;
    String cname;
    String catname;
    String status;
    String zname;
}
