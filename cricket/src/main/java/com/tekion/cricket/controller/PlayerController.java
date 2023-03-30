package com.tekion.cricket.controller;

import com.tekion.cricket.datasource.model.Player;
import com.tekion.cricket.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/")
    public List<Player> getAll() {
        return playerService.getAll();
    }

    @GetMapping("/{id}")
    public Player getById(@PathVariable Long id) {
        return playerService.getById(id);
    }

    @PostMapping("/add")
    public Player add(@RequestBody Player player) {

        return playerService.add(player);
    }
    @PutMapping("/update")
    public Player update(@RequestBody Player player) {
        return playerService.update(player);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return playerService.delete(id);
    }
}
