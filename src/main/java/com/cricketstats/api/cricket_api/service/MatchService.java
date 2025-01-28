package com.cricketstats.api.cricket_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketstats.api.cricket_api.entities.Match;
import com.cricketstats.api.cricket_api.repositories.MatchRepository;

@Service
public class MatchService {
    @Autowired
    private MatchRepository matchRepository;

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public Match getMatchById(Long id) {
        return matchRepository.findById(id).orElseThrow(() -> new RuntimeException("Match not found"));
    }

    public Match addMatch(Match match) {
        return matchRepository.save(match);
    }

    public Match updateMatch(Long id, Match updatedMatch) {
        Match match = getMatchById(id);
        match.setMatchDate(updatedMatch.getMatchDate());
        match.setTeam1(updatedMatch.getTeam1());
        match.setTeam2(updatedMatch.getTeam2());
        match.setMatchType(updatedMatch.getMatchType());
        match.setVenue(updatedMatch.getVenue());
        match.setResult(updatedMatch.getResult());
        return matchRepository.save(match);
    }

    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }
}
