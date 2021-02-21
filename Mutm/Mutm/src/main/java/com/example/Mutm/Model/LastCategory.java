package com.example.Mutm.Model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class LastCategory {
    @Id
    int lcid;
    String lcname;
    int price;
    int catid;
    String status;
    String condision;
}
