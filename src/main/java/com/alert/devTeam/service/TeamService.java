/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alert.devTeam.service;

import com.alert.devTeam.Entity.Developer;
import com.alert.devTeam.Entity.TeamEntity;
import com.alert.devTeam.Model.TeamDTO;
import com.alert.devTeam.repository.DeveloperRepo;
import com.alert.devTeam.repository.TeamRepo;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    TeamRepo teamRepo;
    
    @Autowired
    DeveloperRepo dev;
    public void saveTeamDetails(TeamDTO teamDetails){
        System.out.println("teamDetails"+teamDetails);
       
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        TeamEntity teamEntity = modelMapper.map(teamDetails, TeamEntity.class);
        System.out.println("teamEntity::"+teamEntity);
        teamRepo.save(teamEntity);
        dev.saveAll(teamEntity.getDevelopers());
        
    }
    
    public String alertDeveloper(String teamId){
        boolean existByTeamId=teamRepo.existsById(teamId);
        if(existByTeamId){
          //  List<Developer> developers=teamRepo.findAllByTeamId(teamId);
            System.out.println("hi all");
            
            return "id";
        }else{
     return null;}   
    }
    
    public String randomPickUp(List id){
        return "id";
    }
}
