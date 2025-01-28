package com.cricketstats.api.cricket_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricketstats.api.cricket_api.entities.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {}