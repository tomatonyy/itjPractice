package src.main.java.com.practicejvfirst.jvpractice6;

public class Member {

    private String id;
    private String pwd;

    public Member() {}

    public Member(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }
    public String getPwd() {
        return pwd;
    }

    public String getInformation() {
        return "id : " + this.id + ", pwd : " + this.pwd;
    }

}
