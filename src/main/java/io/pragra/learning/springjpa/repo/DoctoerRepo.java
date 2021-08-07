package io.pragra.learning.springjpa.repo;

import io.pragra.learning.springjpa.domain.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctoerRepo extends JpaRepository<Doctor, Long> {
}
