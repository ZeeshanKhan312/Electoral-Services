package com.project.electoralServices.Entities;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Candidate")
@DynamicUpdate
public class Candidate {
    @Id
    private String name;
    private int vote;

    public Candidate(String name, int vote) {
        this.name = name;
        this.vote = vote;
    }

    public Candidate() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }
}
