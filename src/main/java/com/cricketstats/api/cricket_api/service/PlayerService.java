package com.cricketstats.api.cricket_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketstats.api.cricket_api.entities.Player;
import com.cricketstats.api.cricket_api.repositories.PlayerRepository;

@Service
public class PlayerService {
 private final PlayerRepository playerRepository;

 @Autowired
 public PlayerService(PlayerRepository playerRepository) {
     this.playerRepository = playerRepository;
 }

 public List<Player> getAllPlayers() {
     return playerRepository.findAll();
 }

 public Player getPlayerById(Long id) {
     return playerRepository.findById(id)
             .orElseThrow(() -> new RuntimeException("Player not found"));
 }

 public Player addPlayer(Player player) {
     return playerRepository.save(player);
 }

 public Player updatePlayer(Long id, Player updatedPlayer) {
     Player player = getPlayerById(id);
     player.setFirstName(updatedPlayer.getFirstName());
     player.setLastName(updatedPlayer.getLastName());
     player.setDob(updatedPlayer.getDob());
     player.setNationality(updatedPlayer.getNationality());
     player.setBattingStyle(updatedPlayer.getBattingStyle());
     player.setBowlingStyle(updatedPlayer.getBowlingStyle());
     return playerRepository.save(player);
 }

 public void deletePlayer(Long id) {
     playerRepository.deleteById(id);
 }
}
