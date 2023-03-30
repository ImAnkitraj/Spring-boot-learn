package com.tekion.cricket.controller;

import com.tekion.cricket.datasource.model.CricketMatch;
import com.tekion.cricket.datasource.model.Player;
import com.tekion.cricket.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("match")
public class MatchController {

    @Autowired
    MatchService service;

    @GetMapping("/")
    public List<CricketMatch> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public CricketMatch add(@RequestBody CricketMatch match) {
        return service.add(match);
    }

//    @PutMapping("/update")
//    public CricketMatch update(@RequestBody CricketMatch match) {
//        return service.update(match);
//    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }
    @PostMapping("/add/{matchId}/teams")
    public String addTeam(@PathVariable Long matchId, @RequestParam Long team1, @RequestParam Long team2) {
        return service.addTeam(matchId, team1, team2);
    }
}
