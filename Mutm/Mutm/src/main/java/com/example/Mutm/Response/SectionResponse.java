package com.example.Mutm.Response;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;

@Entity
@Data

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name="getAllSections",procedureName = "getAllSection",
                resultClasses = SectionResponse.class)
})
public class SectionResponse {

    @Id
    private int id;
    private String title;
    private String status;
}
