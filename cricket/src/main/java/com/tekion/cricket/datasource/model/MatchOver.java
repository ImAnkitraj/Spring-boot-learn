package com.tekion.cricket.datasource.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchOver {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Player baller;

    @OneToMany(mappedBy = "matchOver")
    private List<Ball> balls;

    @ManyToOne
    private Inning inning;
}
