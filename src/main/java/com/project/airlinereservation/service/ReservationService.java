package com.project.airlinereservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.airlinereservation.repository.ReservationRepository;


@Service
public class ReservationService {
	@Autowired
	ReservationRepository reservationRepository;

}
