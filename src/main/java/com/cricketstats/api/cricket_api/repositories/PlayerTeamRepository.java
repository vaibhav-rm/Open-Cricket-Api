package com.cricketstats.api.cricket_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricketstats.api.cricket_api.entities.PlayerTeam;

public interface PlayerTeamRepository extends JpaRepository<PlayerTeam, Long> {}