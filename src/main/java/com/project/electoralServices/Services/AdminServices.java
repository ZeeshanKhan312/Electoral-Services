//package com.project.electoralServices.Services;
//
//
//import com.project.electoralServices.Entities.Admins;
//import com.project.electoralServices.Entities.Candidate;
//import com.project.electoralServices.Entities.Voter;
//import com.project.electoralServices.dao.AdminRepository;
//import com.project.electoralServices.dao.CandidateRepository;
//import com.project.electoralServices.dao.VoterRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class AdminServices {
//    @Autowired
//    public AdminRepository adminList;
//
//    public Admins loginUser(String userName, String password){
//        Admins user=adminList.findByAdminIdAndPassword(userName,password);
//        return user;
//    }
//    //to get the details of all admins
//    public List<Admins> getAllAdmin(){
//        List<Admins> adminLists=(List<Admins>) this.adminList.findAll();
//        return adminLists;
//    }
//    // to add new admin
//    public void addAdmin(Admins admin){
//        adminList.save(admin);
//    }
//    //to delete an admin
//    public void deleteAdmin(String uName){
//        adminList.deleteById(uName);
//    }
//
//    @Autowired
//    private VoterRepository list;
//    //to get the details of all voters
//    public List<Voter> getAllVoter(){
//        List<Voter> voters =(List<Voter>) this.list.findAll();
//        return voters;
//    }
//    //to add a ner voter
//    public void addVoter(Voter voter){
//        list.save(voter);
//    }
//    //to delete a voter
//    public void deleteVoter(String voterId){
//        list.deleteById(voterId);
//    }
//
//    @Autowired
//    public CandidateRepository candidateList;
//    //to get the details of all candidates
//    public List<Candidate>  fetchAllCandidate(){
//        List<Candidate> list= (List<Candidate>) this.candidateList.findAll();
//        return list;
//    }
//    //to add a new candidate
//    public void addCandidate(Candidate candidate){
//        this.candidateList.save(candidate);
//    }
//    //to delete a candidate
//    public void deleteCandidate(String name){
//        this.candidateList.deleteById(name);
//    }
//}
