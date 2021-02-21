package com.example.Mutm.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Vyanzo {
    @Id
    int cid;
    String cname,status;
    int lgaid;
}
