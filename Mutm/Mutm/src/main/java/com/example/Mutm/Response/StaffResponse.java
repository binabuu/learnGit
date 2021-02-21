package com.example.Mutm.Response;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name="getAllStaffs",procedureName = "getAllStaff",
                resultClasses = StaffResponse.class ),
        @NamedStoredProcedureQuery(name="insertStaffs",procedureName = "insertStaff",
                parameters = {
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="uname",type=String.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="fname",type=String.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="mname",type=String.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="lname",type=String.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="zone",type=int.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="sec",type=int.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="lga",type=int.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="status",type=String.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="phonenumber",type=String.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="gender",type=String.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="nenolasiri",type=String.class)
                }),
        @NamedStoredProcedureQuery(name="getLoggedIn",procedureName = "getLoggedIn",
                parameters = {
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="uname",type=String.class),
                        @StoredProcedureParameter(mode= ParameterMode.IN,name="password",type=String.class)
                },  resultClasses = StaffResponse.class)
})
public class StaffResponse {
    @Id
    int staffid;
    String jinalamatumizi;
    String firstname;
    String middlename;
    String lastname;
    String gender;
    String phonenumber;
    String status;
    String zname;
    String secname;
    String lganame;
}
