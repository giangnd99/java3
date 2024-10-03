package lab4.lab4_3;

import java.util.List;

public class User {

    private String fullname;
    private String country;
    private String username;
    private String password;
    private String sex;
    private boolean married;
    private String nationally;
    private List<String> liked;
    private String note;

    public User() {
        // TODO Auto-generated constructor stub
    }

    public User(String fullname, String country) {
        super();
        this.fullname = fullname;

        this.country = country;
    }

    public User(String fullname, String country, String username, String password, String sex, boolean married, String nationally, List<String> liked, String note) {
        this.fullname = fullname;
        this.country = country;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.married = married;
        this.nationally = nationally;
        this.liked = liked;
        this.note = note;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getNationally() {
        return nationally;
    }

    public void setNationally(String nationally) {
        this.nationally = nationally;
    }

    public List<String> getLiked() {
        return liked;
    }

    public void setLiked(List<String> liked) {
        this.liked = liked;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
