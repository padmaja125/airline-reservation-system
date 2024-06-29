package com.project.airlinereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.airlinereservation.model.Feedback;
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
