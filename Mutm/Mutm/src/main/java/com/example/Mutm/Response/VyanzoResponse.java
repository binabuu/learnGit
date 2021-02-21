package com.example.Mutm.Response;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;

@Entity
@Data
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name="getAllVyanzos",procedureName = "getAllVyanzo",
                resultClasses = VyanzoResponse.class)
})

public class VyanzoResponse {
    @Id
    int cid;
    String cname;
    String status;
    String lganame;

}
