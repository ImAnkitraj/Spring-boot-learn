package com.tekion.cricket.service;

import com.tekion.cricket.datasource.model.Player;
import com.tekion.cricket.datasource.model.Team;
import com.tekion.cricket.datasource.repository.PlayerRepository;
import com.tekion.cricket.datasource.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository repository;
    @Autowired
    private PlayerRepository playerRepository;
    public List<Team> getAll() {
        return repository.findAll();
    }

    public Team add(Team team) {
        return repository.save(team);
    }

    @Transactional
    public String addPlayer(Long teamId, Long playerId) {
        Player player = playerRepository.findById(playerId).get();
        Team team = repository.findById(teamId).get();
        player.setTeam(team);

        return player.getName() + " added to " + team.getName();
    }
}
