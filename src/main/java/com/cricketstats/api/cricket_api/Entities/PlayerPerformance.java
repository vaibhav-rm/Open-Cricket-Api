package com.cricketstats.api.cricket_api.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_performance")
public class PlayerPerformance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double battingAverage;
    private Integer highestScore;
    private Double bowlingEconomy;
    
    @OneToOne
    @JoinColumn(name = "player_id")
    private Player player;
}
