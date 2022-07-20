//package com.project.electoralServices.Controllers;
//
//
//import com.project.electoralServices.Entities.Admins;
//import com.project.electoralServices.Entities.Candidate;
//import com.project.electoralServices.Entities.Voter;
//import com.project.electoralServices.Services.AdminServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Objects;
//
//@Controller
//public class AdminController {
//
//    @Autowired
//    private AdminServices adminService;
//
//    @GetMapping("/adminLogin")
//    public String login(Model model){
//        model.addAttribute("admin", new Admins());
//        return "adminLogin";
//    }
//
//
//    @PostMapping("/adminLogin")
//    public String login(@ModelAttribute("user") Admins user ) {
//
//        Admins oauthUser = adminService.loginUser(user.getuName(),user.getPasw());
//
//        System.out.print(oauthUser);
//        if(Objects.nonNull(oauthUser))
//        {
//            return "redirect:/adminTask";
//
//        } else {
//            return "redirect:/adminLogin";
//
//        }
//    }
//
//    //to get the list of admins
//    @GetMapping(path = "/admin")
//    public List<Admins> getAdmins(){
//        return this.adminService.getAllAdmin();
//    }
//    //to add new admin
//    @PostMapping(path = "/admin")
//    public void addAdmin(@RequestBody Admins admin){
//        this.adminService.addAdmin(admin);
//    }
//    //to delete an admin
//    @DeleteMapping(path = "/admin/{uName}")
//    public void deleteAdmin(@PathVariable("uName") String uName ){
//        this.adminService.deleteAdmin(uName);
//    }
//
//
//    //to display the list of voters
//    @GetMapping(path = "/voter")
//    public List<Voter> getVoter(){
//        return this.adminService.getAllVoter();
//    }
//    //to add the voter
//    @PostMapping(path = "/voter")
//    public void addVoter(@RequestBody Voter voter){
//        this.adminService.addVoter(voter);
//    }
//    //to delete the voter
//    @DeleteMapping(path = "/voter/{voterId}")
//    public void deleteVoter(@PathVariable("voterId") String voterId){
//        this.adminService.deleteVoter(voterId);
//    }
//
//
//    //to see the list of candidates
//    @GetMapping(path = "/candidate")
//    public List<Candidate> getAllCandidate(){
//        return this.adminService.fetchAllCandidate();
//    }
//    //to add new candidate
//    @PostMapping(path = "/candidate")
//    public void addCandidate(@RequestBody Candidate candidate){
//        this.adminService.addCandidate(candidate);
//    }
//    //to delete a candidate
//    @DeleteMapping(path = "/candidate/{name}")
//    public void deleteCandidate(@PathVariable ("name") String name){
//        this.adminService.deleteCandidate(name);
//    }
//
//
//}
