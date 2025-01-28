package com.cricketstats.api.cricket_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketstats.api.cricket_api.entities.PlayerStatistics;
import com.cricketstats.api.cricket_api.repositories.PlayerStatisticsRepository;

@Service
public class PlayerStatisticsService {
    @Autowired
    private PlayerStatisticsRepository statisticsRepository;

    public List<PlayerStatistics> getAllStatistics() {
        return statisticsRepository.findAll();
    }

    public PlayerStatistics getStatisticsById(Long id) {
        return statisticsRepository.findById(id).orElseThrow(() -> new RuntimeException("Statistics not found"));
    }

    public PlayerStatistics addStatistics(PlayerStatistics statistics) {
        return statisticsRepository.save(statistics);
    }

    public void deleteStatistics(Long id) {
        statisticsRepository.deleteById(id);
    }
}
