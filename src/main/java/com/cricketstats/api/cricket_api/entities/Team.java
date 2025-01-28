package com.cricketstats.api.cricket_api.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Teams")
public class Team {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long teamId;

 @Column(nullable = false, length = 100)
 private String teamName;

 public Long getTeamId() {
	return teamId;
}

public void setTeamId(Long teamId) {
	this.teamId = teamId;
}

public String getTeamName() {
	return teamName;
}

public void setTeamName(String teamName) {
	this.teamName = teamName;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public Integer getEstablished() {
	return established;
}

public void setEstablished(Integer established) {
	this.established = established;
}

public LocalDateTime getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
}

@Column(nullable = false, length = 50)
 private String country;

 @Column
 private Integer established;

 @Column(updatable = false)
 private LocalDateTime createdAt = LocalDateTime.now();

 // Getters and setters
}
