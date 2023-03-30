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
public class Inning {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JsonIgnore
    private CricketMatch cricketMatch;
    @OneToMany(mappedBy = "inning", fetch = FetchType.LAZY)
    private List<MatchOver> matchOvers;

}
