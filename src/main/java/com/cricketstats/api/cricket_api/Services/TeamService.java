package com.cricketstats.api.cricket_api.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cricketstats.api.cricket_api.Entities.Team;
import com.cricketstats.api.cricket_api.Repositories.TeamRepository;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long id) {
        return teamRepository.findById(id);
    }

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }
}