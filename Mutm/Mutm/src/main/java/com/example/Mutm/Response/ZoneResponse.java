package com.example.Mutm.Response;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;

@Entity
@Data

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name="getAllZones",procedureName = "getAllZone",
                resultClasses = ZoneResponse.class)
})
public class ZoneResponse {

    @Id
     int id;
     String title;
     String status;
     String lganame;

}
