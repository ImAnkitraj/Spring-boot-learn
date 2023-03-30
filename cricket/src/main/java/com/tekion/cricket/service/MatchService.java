package com.tekion.cricket.service;

import com.tekion.cricket.datasource.model.CricketMatch;
import com.tekion.cricket.datasource.model.Team;
import com.tekion.cricket.datasource.repository.MatchRepository;
import com.tekion.cricket.datasource.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    MatchRepository repository;

    @Autowired
    TeamRepository teamRepository;

    public List<CricketMatch> getAll() {
        return repository.findAll();
    }

    public CricketMatch add(CricketMatch match) {
        return repository.save(match);
    }

    @Transactional
    public String addTeam(Long matchId, Long team1Id, Long team2Id) {
        CricketMatch match = repository.findById(matchId).get();
        if(team1Id == team2Id) {
            return "Please select two different teams";
        }
        Team team1 = teamRepository.findById(team1Id).get();
        Team team2 = teamRepository.findById(team2Id).get();
        match.setTeam1(team1);
        match.setTeam2(team2);
        return team1.getName() + " and " + team2.getName() + " added to match " + match.getId();
    }

//    public CricketMatch update(CricketMatch match) {
//
//
//    }

    public String delete(Long id) {

        return "Deleted match with id : " + id;
    }
}
