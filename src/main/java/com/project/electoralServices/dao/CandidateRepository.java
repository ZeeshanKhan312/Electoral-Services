package com.project.electoralServices.dao;

import com.project.electoralServices.Entities.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate,String> {
//    public Candidate findByCandidateId(String name);
    public Candidate findByName(String name);
}
