package com.example.Mutm.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Category {
    @Id
    int catId;
    String catname;
    int cid;
    String status;
    int zid;
}
