package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class question {
    
    @Id
    private String uname;
    private String ques1;
    private String ans1;
    private String ques2;
    private String ans2;
    private String ques3;
    private String ans3;

    public question() {
    }

    public question(String uname, String ques1, String ans1, String ques2, String ans2, String ques3, String ans3) {
        this.uname = uname;
        this.ques1 = ques1;
        this.ans1 = ans1;
        this.ques2 = ques2;
        this.ans2 = ans2;
        this.ques3 = ques3;
        this.ans3 = ans3;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    
    public String getQues1() {
        return ques1;
    }

    public void setQues1(String ques1) {
        this.ques1 = ques1;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getQues2() {
        return ques2;
    }

    public void setQues2(String ques2) {
        this.ques2 = ques2;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getQues3() {
        return ques3;
    }

    public void setQues3(String ques3) {
        this.ques3 = ques3;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }
    
}
