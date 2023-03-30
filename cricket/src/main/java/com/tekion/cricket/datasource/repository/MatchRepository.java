package com.tekion.cricket.datasource.repository;

import com.tekion.cricket.datasource.model.CricketMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<CricketMatch, Long> {

}
