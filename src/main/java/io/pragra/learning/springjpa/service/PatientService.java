package io.pragra.learning.springjpa.service;

import io.pragra.learning.springjpa.domain.entities.Patient;
import io.pragra.learning.springjpa.repo.PatientRepo;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private final PatientRepo repo;

    public PatientService(PatientRepo repo) {
        this.repo = repo;
    }

    public Patient createPatient(Patient patient) {
        return this.repo.save(patient);
    }
}
