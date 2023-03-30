package com.tekion.cricket.datasource.model;


import ch.qos.logback.core.model.INamedModel;
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
public class CricketMatch {

    @Id
    @GeneratedValue
    private long id;
    private String venue;

    @ManyToOne
    private Team team1;
    @ManyToOne
    private Team team2;

    @OneToMany(mappedBy = "cricketMatch", fetch = FetchType.LAZY)
    private List<Inning> innings;


}
