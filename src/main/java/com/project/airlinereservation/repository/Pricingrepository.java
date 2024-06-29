package com.project.airlinereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.airlinereservation.model.Pricing;

@Repository
public interface Pricingrepository extends JpaRepository<Pricing, Long> {

}
