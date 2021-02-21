package com.example.Mutm.Model;
import com.example.Mutm.Utils.Password;
import javax.persistence.*;
import java.security.NoSuchAlgorithmException;
import static com.example.Mutm.Utils.Password.createSalt;

@Entity

public class Staff {
    @Id
    private int staffid;
    private String jinalamatumizi;
    private String firstname;
    private  String middlename;
    private String lastname;
    private String gender;
    private String phonenumber;
    private int zoneid;
    private int secid;
    private int lgaid;
    private String nenolasiri;
    private String status;


    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public void setJinalamatumizi(String jinalamatumizi) {
        this.jinalamatumizi = jinalamatumizi;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setZoneid(int zoneid) {
        this.zoneid = zoneid;
    }

    public void setSecid(int secid) {
        this.secid = secid;
    }

    public void setLgaid(int lgaid) {
        this.lgaid = lgaid;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNenolasiri(String nenolasiri) {
        this.nenolasiri = nenolasiri;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getStaffid() {
        return staffid;
    }

    public String getJinalamatumizi() {
        return jinalamatumizi;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public int getZoneid() {
        return zoneid;
    }

    public int getSecid() {
        return secid;
    }

    public int getLgaid() {
        return lgaid;
    }
    public String getGender() {
        return gender;
    }

    public String getNenolasiri() throws NoSuchAlgorithmException {
        byte salt = createSalt();
        nenolasiri = new Password().generateHash(jinalamatumizi,"MD5",salt);
        return nenolasiri;
    }

    public String getStatus() {
       setStatus("active");
        return status;
    }

    public String getPhonenumber() {
        return phonenumber;
    }


}
