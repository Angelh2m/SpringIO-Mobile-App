package com.appdeveloperblog.app.ws.model.response;

public class UserRest {

    private String userId;
    private String firstName;
    private String lastName;
    private String email;

    public String getUserid() {
        return this.userId;
    }

    public void setUserid(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return this.firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return this.lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }
}