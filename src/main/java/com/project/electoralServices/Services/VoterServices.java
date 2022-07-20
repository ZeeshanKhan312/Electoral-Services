package com.project.electoralServices.Services;


import com.project.electoralServices.Entities.Candidate;
import com.project.electoralServices.Entities.Voter;
import com.project.electoralServices.dao.CandidateRepository;
import com.project.electoralServices.dao.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class VoterServices {
    @Autowired
    private VoterRepository list;
    @Autowired
    private CandidateRepository candidateList;

    public Voter loginUser(String voterId){
        Voter user=list.findByVoterId(voterId);
        return user;
    }
    //to update a voter details
    public void updateVoter(String VoterId,String address){
        Voter voter=list.findByVoterId(VoterId);
//        voterLists.setVoterId(VoterId);
        voter.setAddress(address);
        list.save(voter);
    }
    //to cast the vote
    public void castVote(String voterId,String name){
        System.out.println(name);
        Candidate candidate=candidateList.findByName(name);
        int x=candidate.getVote();
        candidate.setVote(x+1);
        Voter voter=list.findByVoterId(voterId);
        voter.setCast(true);
        list.save(voter);
        candidateList.save(candidate);
    }
}
