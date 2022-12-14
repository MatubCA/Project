package com.dong.entity;/*
 * ClassName: com.dong.entity.DormitoryAdmin
 * date: 2022/8/10 19:12
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

public class DormitoryAdmin {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String gender;
    private String telephone;

    public DormitoryAdmin() {
    }

    public DormitoryAdmin(Integer id, String username, String password, String name, String gender, String telephone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.telephone = telephone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "DormitoryAdmin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
