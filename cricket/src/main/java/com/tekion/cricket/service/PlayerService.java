package com.tekion.cricket.service;

import com.tekion.cricket.datasource.model.Player;
import com.tekion.cricket.datasource.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Transactional
    public List<Player> getAll() {
        return playerRepository.findAll();
    }

    public Player add(Player player) {
        return playerRepository.save(player);
    }

    @Transactional
    public Player getById(Long id) {
        return playerRepository.findById(id).get();
    }

    public Player update(Player player) {

        return playerRepository.save(player);
    }

    public String delete(Long id) {
        playerRepository.deleteById(id);
        return "Deleted Player with id : " + id;
    }
}
