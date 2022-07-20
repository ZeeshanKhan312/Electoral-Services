package com.project.electoralServices.dao;


import com.project.electoralServices.Entities.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRepository extends JpaRepository<Voter,String> {
    public Voter findByVoterId(String voterId);
}
