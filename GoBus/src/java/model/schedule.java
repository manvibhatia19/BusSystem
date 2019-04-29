package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class schedule {
    @Id
    private int busno;
    private String source;
    private String dest;
    private String via;
    private String time;

    public schedule() {
    }

    public schedule(int busno, String source, String dest, String via, String time) {
        this.busno = busno;
        this.source = source;
        this.dest = dest;
        this.via = via;
        this.time = time;
    }

    public int getBusno() {
        return busno;
    }

    public void setBusno(int busno) {
        this.busno = busno;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
