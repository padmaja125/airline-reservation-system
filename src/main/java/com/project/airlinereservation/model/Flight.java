package com.project.airlinereservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//id, flightNumber, departure, destination, and schedule
@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String flightNumber;
	private String departure;
	private String destination;
	private String schedule;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", departure=" + departure + ", destination=" + destination
				+ ", schedule=" + schedule + "]";
	}
	
	
	
}
