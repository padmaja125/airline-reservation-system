package com.project.airlinereservation.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//id, flightNumber, departure, destination, and schedule
@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "flightNumber")
	private String flightNumber;
	private String departure;
	private String destination;
	private LocalDateTime schedule;
	@OneToMany(mappedBy="flight")
	private List<Reservation> reservation;
    @OneToMany(mappedBy = "flight")
    private List<Pricing> pricings;
	
	public List<Pricing> getPricings() {
		return pricings;
	}
	public void setPricings(List<Pricing> pricings) {
		this.pricings = pricings;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public List<Reservation> getReservation() {
		return reservation;
	}
	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
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
	public LocalDateTime getSchedule() {
		return schedule;
	}
	public void setSchedule(LocalDateTime schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", departure=" + departure + ", destination=" + destination
				+ ", schedule=" + schedule + "]";
	}	
}
