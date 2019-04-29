package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class signin {
    
    private String fname;
    private String lname;
    private String email;
    @Id
    private String uname;
    private String acco;
    private String pass;
    private String cpass;

    public signin() {
    }

    public signin(String fname, String lname, String email, String uname, String acco, String pass, String cpass) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.uname = uname;
        this.acco = acco;
        this.pass = pass;
        this.cpass = cpass;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAcco() {
        return acco;
    }

    public void setAcco(String acco) {
        this.acco = acco;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }
    
    
}
