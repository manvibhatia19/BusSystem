package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user {
    
    @Id
    private String uname;
    private String pass;
    private String acco;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getAcco() {
        return acco;
    }

    public void setAcco(String acco) {
        this.acco = acco;
    }
    
    @Override
    public boolean equals(Object o) {
        user u = (user) o;
        return this.uname.equals(u.uname) && this.pass.equals(u.pass) && this.acco.equals(u.acco);
    }
    
}
