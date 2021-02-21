package com.example.Mutm.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Section {
    @Id
    private int sId;
    private String secname;
    private String status;

    public void setsId(int sId) {
        this.sId = sId;
    }

    public void setSecname(String secname) {
        this.secname = secname;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getsId() {
        return sId;
    }

    public String getSecname() {
        return secname;
    }

    public String getStatus() {
        return status;
    }
}
