package com.cricketstats.api.cricket_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketstats.api.cricket_api.entities.PlayerStatistics;
import com.cricketstats.api.cricket_api.service.PlayerStatisticsService;

@RestController
@RequestMapping("/api/statistics")
public class PlayerStatisticsController {
    @Autowired
    private PlayerStatisticsService statisticsService;

    @GetMapping
    public List<PlayerStatistics> getAllStatistics() {
        return statisticsService.getAllStatistics();
    }

    @GetMapping("/{id}")
    public PlayerStatistics getStatisticsById(@PathVariable Long id) {
        return statisticsService.getStatisticsById(id);
    }

    @PostMapping
    public PlayerStatistics addStatistics(@RequestBody PlayerStatistics statistics) {
        return statisticsService.addStatistics(statistics);
    }

    @DeleteMapping("/{id}")
    public void deleteStatistics(@PathVariable Long id) {
        statisticsService.deleteStatistics(id);
    }
}
