package com.project.electoralServices.Controllers;


import com.project.electoralServices.Entities.Voter;
import com.project.electoralServices.Services.VoterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
public class VoterController {

    @Autowired
    private VoterServices voterServices;

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("voter", new Voter());
        return "voterLogin";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") Voter user ) {

        Voter oauthUser = voterServices.loginUser(user.getVoterId());

        System.out.print(oauthUser);
        if(Objects.nonNull(oauthUser))
        {
            return "redirect:/voterTask";

        } else {
            return "redirect:/login";

        }
    }

    @GetMapping("/voterTask")
    public String voterTask(){
        return "voterTask";
    }

    //to update voter details
    @PutMapping(path = "/voter/{voterId}")
    public void updateVoter(@RequestBody String address, @PathVariable("voterId") String voterId){
        this.voterServices.updateVoter(voterId,address);
//        return voterList;
    }
    //to cast the vote
    @PutMapping(path = "/voter/vote/{voterId}")
    public void castVote(@RequestBody String name, @PathVariable("voterId")String voterId){
        this.voterServices.castVote(voterId,name);
    }
}
