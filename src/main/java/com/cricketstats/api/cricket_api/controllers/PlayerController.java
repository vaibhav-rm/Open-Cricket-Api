package com.cricketstats.api.cricket_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketstats.api.cricket_api.entities.Player;
import com.cricketstats.api.cricket_api.service.PlayerService;

//PlayerController.java
@RestController
@RequestMapping("/api/players")
public class PlayerController {
 private final PlayerService playerService;

 @Autowired
 public PlayerController(PlayerService playerService) {
     this.playerService = playerService;
 }

 @GetMapping
 public List<Player> getAllPlayers() {
     return playerService.getAllPlayers();
 }

 @GetMapping("/{id}")
 public Player getPlayerById(@PathVariable Long id) {
     return playerService.getPlayerById(id);
 }

 @PostMapping
 public Player addPlayer(@RequestBody Player player) {
     return playerService.addPlayer(player);
 }

 @PutMapping("/{id}")
 public Player updatePlayer(@PathVariable Long id, @RequestBody Player player) {
     return playerService.updatePlayer(id, player);
 }

 @DeleteMapping("/{id}")
 public void deletePlayer(@PathVariable Long id) {
     playerService.deletePlayer(id);
 }
}
