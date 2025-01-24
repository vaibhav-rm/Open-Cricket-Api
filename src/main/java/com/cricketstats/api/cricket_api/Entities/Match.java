package com.cricketstats.api.cricket_api.Entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date matchDate;
    private String venue;
    
    @ManyToOne
    @JoinColumn(name = "match_type_id")
    private MatchType matchType;

    @ManyToOne
    @JoinColumn(name = "team_1_id")
    private Team team1;
    
    @ManyToOne
    @JoinColumn(name = "team_2_id")
    private Team team2;
    
    @ManyToOne
    @JoinColumn(name = "winner_team_id")
    private Team winner;
}