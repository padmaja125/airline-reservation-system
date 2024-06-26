package com.project.airlinereservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.airlinereservation.model.Flight;
import com.project.airlinereservation.repository.FlightRepository;

//getting all flights, getting a flight by ID, adding a flight, and deleting a flight
@Service
public class FlightService {
	
	@Autowired
	FlightRepository flightRepository;
	
	public List<Flight> getAllFlights(){
		return flightRepository.findAll();}
	
	public Flight getFlightsById(Long id){
		return flightRepository.findById(id).orElse(null);}
	
	public Flight addFlight(Flight flight){
		return flightRepository.save(flight);}
	
	public void deleteFlightById(Long id){
		flightRepository.deleteById(id);}
	
}
