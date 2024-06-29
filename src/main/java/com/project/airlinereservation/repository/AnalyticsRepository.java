package com.project.airlinereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.airlinereservation.model.Analytics;

@Repository
public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {

}
