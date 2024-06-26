package com.project.airlinereservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.airlinereservation.model.Flight;
import com.project.airlinereservation.service.FlightService;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
	 @Autowired
	 FlightService flightService;
 
 	@GetMapping
	public List<Flight> getAllFlights(){
		return flightService.getAllFlights();}
 	
	@GetMapping("/{id}")
	public Flight getFlightsById(@PathVariable Long id){
		return flightService.getFlightsById(id);}
	
	@PostMapping
	public Flight addFlight(@RequestBody Flight flight){
		return flightService.addFlight(flight);}
	
	@DeleteMapping("/{id}")
	public void deleteFlightById(@PathVariable Long id){
		flightService.deleteFlightById(id);}
	 
}
