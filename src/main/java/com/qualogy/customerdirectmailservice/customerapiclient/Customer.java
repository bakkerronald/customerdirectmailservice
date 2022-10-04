package com.qualogy.customerdirectmailservice.customerapiclient;

public class Customer {
    private Integer id;

    private String name;

    private String email;

    private boolean directMail;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDirectMail() {
        return directMail;
    }

    public void setDirectMail(boolean directMail) {
        this.directMail = directMail;
    }
}
