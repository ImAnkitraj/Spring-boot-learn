package com.tekion.cricket.controller;

import com.tekion.cricket.datasource.model.Team;
import com.tekion.cricket.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teams")
public class TeamController {

    @Autowired
    private TeamService service;

    @GetMapping("/")
    public List<Team> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public Team add(@RequestBody Team team) {
        return service.add(team);
    }

    @GetMapping("/{teamId}/player/{playerId}/add")
    public String addPlayer(@PathVariable Long teamId, @PathVariable Long playerId) {
        return service.addPlayer(teamId, playerId);
    }
}
