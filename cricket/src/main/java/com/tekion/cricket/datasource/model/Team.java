package com.tekion.cricket.datasource.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    private List<CricketMatch> cricketMatches;

    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    private List<Player> players;

    public void addPlayer(Player player) {
        players.add(player);
    }
}
