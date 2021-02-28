package com.example.tp6exo2;

public class Contact {
    private String name;
    private String last_name;
    private String mobile;
    private String email;

    public Contact(String name, String last_name, String mobile, String email) {
        this.name = name;
        this.last_name = last_name;
        this.mobile = mobile;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
