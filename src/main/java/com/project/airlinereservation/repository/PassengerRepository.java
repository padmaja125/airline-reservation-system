package com.project.airlinereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.airlinereservation.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
