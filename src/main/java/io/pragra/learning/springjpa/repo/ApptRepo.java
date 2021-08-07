package io.pragra.learning.springjpa.repo;

import io.pragra.learning.springjpa.domain.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApptRepo extends JpaRepository<Appointment,Integer> {

}

// POJO - DOMAIN
