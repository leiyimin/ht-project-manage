package htmap.pjmanage.entity;

public class User {
    private Integer id;
    private String userName;
    private String name;
    private String passWord;
    private String dept;
    private String email;
    private Boolean disabled;

    public User() {
    }

    public User(Integer id, String userName, String name, String passWord, String dept, String email, Boolean disabled) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.passWord = passWord;
        this.dept = dept;
        this.email = email;
        this.disabled = disabled;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }
}
