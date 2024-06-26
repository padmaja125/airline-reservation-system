package com.project.airlinereservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.airlinereservation.model.Passenger;
import com.project.airlinereservation.repository.PassengerRepository;

@Service
public class PassengerService {
	@Autowired
	PassengerRepository passengerRepository;



	public List<Passenger> getAllPassengers() {
		// TODO Auto-generated method stub
		return passengerRepository.findAll();
	}



	public Passenger getPassengersById(Long id) {
		// TODO Auto-generated method stub
		return passengerRepository.findById(id).orElse(null);
	}



	public Passenger addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return passengerRepository.save(passenger);
	}



	public void deletePassengerById(Long id) {
		// TODO Auto-generated method stub
		passengerRepository.deleteById(id);
		
	}

}
