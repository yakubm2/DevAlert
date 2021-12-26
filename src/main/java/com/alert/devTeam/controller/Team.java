/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alert.devTeam.controller;

import com.alert.devTeam.Model.TeamDTO;
import com.alert.devTeam.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class Team {
   @Autowired
   TeamService teamService;
   
    @PostMapping(path = "/create", produces = "application/json")
    public String createTeam(@RequestBody TeamDTO teamDetails) {
       // System.out.print("teamDetails: "+teamDetails);
        teamService.saveTeamDetails(teamDetails);
        return "created Team";
    }
    
    @PostMapping(path = "{team_id}/alert", produces = "application/json")
    public String alertTeam() {
        return "created Team";
    }
}
