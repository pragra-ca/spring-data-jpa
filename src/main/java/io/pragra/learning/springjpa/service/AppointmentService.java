package io.pragra.learning.springjpa.service;

import io.pragra.learning.springjpa.domain.StatusEnum;
import io.pragra.learning.springjpa.domain.entities.Appointment;
import io.pragra.learning.springjpa.repo.ApptRepo;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class AppointmentService {

    private ApptRepo repo;

    public AppointmentService(ApptRepo repo) {
        this.repo = repo;
    }

    public Appointment createAppoint(Appointment appointment) {
        if(appointment.getFirstName()==null) {
            throw new IllegalArgumentException("First Name can't be null");
        }
        appointment.setCreateDate(Instant.now());
        appointment.setUpdateUpdate(Instant.now());
        if(appointment.getAppointmentDate().compareTo(Instant.now())==-1){
            throw new IllegalArgumentException("Appoitment can't in past");
        }
        appointment.setStatus(StatusEnum.ORIGINAL);
        return repo.save(appointment);
    }

    public Appointment update(Appointment appointment) {
        if(appointment.getFirstName()==null) {
            throw new IllegalArgumentException("First Name can't be null");
        }
        appointment.setUpdateUpdate(Instant.now());
        if(appointment.getAppointmentDate().compareTo(Instant.now())==-1){
            throw new IllegalArgumentException("Appoitment can't in past");
        }
        appointment.setStatus(StatusEnum.RESCHEDULED);
        return repo.save(appointment);
    }

    public Appointment getByID(int id) {
        if(id<=0) {
            throw new IllegalArgumentException("Id can't be 0 or negative");
        }
        return repo.findById(id).orElseThrow(IllegalAccessError::new);
    }

    public List<Appointment> findAll() {
        return repo.findAll();
    }

    public List<Appointment> getAllForADoctor(String doctorName){
        return repo.findAllByDoctorName(doctorName);
    }
}
