package com.cricketstats.api.cricket_api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cricketstats.api.cricket_api.Entities.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {}
