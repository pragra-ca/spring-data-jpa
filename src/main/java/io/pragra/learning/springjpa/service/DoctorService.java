package io.pragra.learning.springjpa.service;

import io.pragra.learning.springjpa.domain.entities.Doctor;
import io.pragra.learning.springjpa.repo.DoctoerRepo;

import java.util.List;


public class DoctorService {
    private DoctoerRepo repo;

    public Doctor createDoctor(Doctor doctor){
        return this.repo.save(doctor);
    }

    public Doctor findById(Long id){
        return this.repo.findById(id).get();
    }

    public List<Doctor> getAll(){
        return repo.findAll();
    }
}
