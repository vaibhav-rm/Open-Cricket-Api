package com.cricketstats.api.cricket_api.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Players")
public class Player {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long playerId;

 @Column(nullable = false, length = 50)
 private String firstName;

 @Column(nullable = false, length = 50)
 private String lastName;

 @Column(nullable = false)
 private LocalDate dob;

 @Column(nullable = false, length = 50)
 private String nationality;

 @Column(length = 20)
 private String battingStyle;

 @Column(length = 20)
 private String bowlingStyle;

 @Column(updatable = false)
 private LocalDateTime createdAt = LocalDateTime.now();

public Long getPlayerId() {
	return playerId;
}

public void setPlayerId(Long playerId) {
	this.playerId = playerId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

public String getNationality() {
	return nationality;
}

public void setNationality(String nationality) {
	this.nationality = nationality;
}

public String getBattingStyle() {
	return battingStyle;
}

public void setBattingStyle(String battingStyle) {
	this.battingStyle = battingStyle;
}

public String getBowlingStyle() {
	return bowlingStyle;
}

public void setBowlingStyle(String bowlingStyle) {
	this.bowlingStyle = bowlingStyle;
}

public LocalDateTime getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
}

 // Getters and setters
}
