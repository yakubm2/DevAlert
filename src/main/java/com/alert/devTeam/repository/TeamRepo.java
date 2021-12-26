/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alert.devTeam.repository;

import com.alert.devTeam.Entity.Developer;
import com.alert.devTeam.Entity.TeamEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepo extends CrudRepository<TeamEntity, String> {
    boolean existsById(int number);
    
    List<Developer> findAllByTeamId(final String teamId);
    
}
