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

import com.project.airlinereservation.model.Passenger;
import com.project.airlinereservation.service.PassengerService;

@RestController
@RequestMapping("/api/passengers")
public class PassengerController {
	@Autowired
	PassengerService passengerService;
	
 	@GetMapping
	public List<Passenger> getAllPassengers(){
		return passengerService.getAllPassengers();}
 	
	@GetMapping("/{id}")
	public Passenger getPassengersById(@PathVariable Long id){
		return passengerService.getPassengersById(id);}
	
	@PostMapping
	public Passenger addPassengers(@RequestBody Passenger passenger){
		return passengerService.addPassenger(passenger);}
	
	@DeleteMapping("/{id}")
	public void deletePassengersById(@PathVariable Long id){
		passengerService.deletePassengerById(id);}

}
