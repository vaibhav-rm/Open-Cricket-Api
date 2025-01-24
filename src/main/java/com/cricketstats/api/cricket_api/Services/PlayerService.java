package com.cricketstats.api.cricket_api.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cricketstats.api.cricket_api.Entities.Player;
import com.cricketstats.api.cricket_api.Repositories.PlayerRepository;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
