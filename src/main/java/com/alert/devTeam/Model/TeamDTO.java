/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alert.devTeam.Model;

import java.util.ArrayList;
import lombok.Data;

@Data
public class TeamDTO {
   String id;
   String name;
   ArrayList<DeveloperDTO> developers;
    
}
