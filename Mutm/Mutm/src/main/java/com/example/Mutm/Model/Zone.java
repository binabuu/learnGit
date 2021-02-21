package com.example.Mutm.Model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data

public class Zone  {
    @Id
     int zid;
     String zname;
    String status;
    int lgaid;


}
