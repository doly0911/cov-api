package co.edu.udea.covapi.dto;

import co.edu.udea.covapi.model.Role;

import java.io.Serializable;

public class UserResponseDTO extends BaseResponseDTO implements Serializable {
    private String name;
    private int age;
    private String email;
    private Role role;

    public UserResponseDTO(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
