package com.cricketstats.api.cricket_api.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cricketstats.api.cricket_api.Entities.Match;
import com.cricketstats.api.cricket_api.Repositories.MatchRepository;

@Service
public class MatchService {
    private final MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public Optional<Match> getMatchById(Long id) {
        return matchRepository.findById(id);
    }

    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }

    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }
}