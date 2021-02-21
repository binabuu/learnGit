package com.example.Mutm.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lga {
    @Id
    private int lgaid;
    private String lganame;
    private String lgastatus;

    public void setLgaid(int lgaid) {
        this.lgaid = lgaid;
    }

    public void setLganame(String lganame) {
        this.lganame = lganame;
    }

    public void setLgastatus(String lgastatus) {
        this.lgastatus = lgastatus;
    }

    public int getLgaid() {
        return lgaid;
    }

    public String getLganame() {
        return lganame;
    }

    public String getLgastatus() {
        return lgastatus;
    }
}
