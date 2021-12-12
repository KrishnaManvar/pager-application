package com.example.controller;

import com.example.model.Developer;
import com.example.model.Team;
import com.example.repository.DeveloperRepository;
import com.example.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    DeveloperRepository developerRepository;

    @RequestMapping(method = RequestMethod.POST, value="/team")
    public void createTeam(@RequestBody Team team){
        teamRepository.save(team);
    }

    @RequestMapping("/team")
    public List<Team> getAllTeams(){
        ArrayList<Team> teams = new ArrayList<>();
        teamRepository.findAll().forEach(teams::add);
        return teams;
    }

    @RequestMapping("/team/{id}")
    public List<Developer> getAllDevelopers(@PathVariable String id){
        ArrayList<Developer> developers = new ArrayList<>();
        developerRepository.findByTeamId(id).forEach(developer -> developers.add(developer));
        return developers;
    }


}
