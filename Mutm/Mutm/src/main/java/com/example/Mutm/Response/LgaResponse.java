package com.example.Mutm.Response;


import lombok.Data;
import javax.persistence.*;

@Entity
@Data

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name="getAllLgas",procedureName = "getAllLga",
                resultClasses = LgaResponse.class )

})
public class LgaResponse {
    @Id
   //@Column(name="id")
    private int id;
    private String title;
    private String lgastatus;
}
