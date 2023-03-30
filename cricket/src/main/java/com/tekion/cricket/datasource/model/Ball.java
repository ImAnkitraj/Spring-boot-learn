package com.tekion.cricket.datasource.model;

import com.tekion.cricket.enums.BallOutcome;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ball {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Player batsman;

    @ManyToOne
    private Player baller;

    @Enumerated(value = EnumType.STRING)
    private BallOutcome ballOutcome;

    @ManyToOne
    private MatchOver matchOver;
}
