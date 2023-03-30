package com.tekion.cricket.datasource.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tekion.cricket.enums.PlayerType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.mapping.ToOne;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private PlayerType playerType;
    @ManyToOne
    @JsonIgnore
    private Team team;
}
