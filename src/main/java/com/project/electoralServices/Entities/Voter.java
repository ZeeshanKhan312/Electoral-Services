package com.project.electoralServices.Entities;

import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Entity
@Table(name = "Voter")
@DynamicUpdate
public class Voter {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String voterId;
    private Calendar dob =new GregorianCalendar();
    private String name;
    private String address;
    private boolean cast;

    public Voter(String voterId, Calendar dob, String name, String address, boolean cast) {
        this.voterId = voterId;
        this.dob = dob;
        this.name = name;
        this.address = address;
        this.cast = cast;
    }

    public Voter() {
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isCast() {
        return cast;
    }

    public void setDob(Calendar dob) {
        this.dob = dob;
    }

    public Calendar getDob() {
        return dob;
    }

    public void setCast(boolean cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterId='" + voterId + '\'' +
                ", dob=" + dob +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cast=" + cast +
                '}';

    }
}
