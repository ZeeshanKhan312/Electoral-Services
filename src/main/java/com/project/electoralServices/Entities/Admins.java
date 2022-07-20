package com.project.electoralServices.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AdminsList")
public class Admins {
    @Id
    private String uName;
    private String pasw;

    public Admins() {
    }

    public Admins(String uName, String pasw) {
        this.uName = uName;
        this.pasw = pasw;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPasw() {
        return pasw;
    }

    public void setPasw(String pasw) {
        this.pasw = pasw;
    }

    @Override
    public String toString() {
        return "Admins{" +
                "uName='" + uName + '\'' +
                ", pasw='" + pasw + '\'' +
                '}';
    }
}
