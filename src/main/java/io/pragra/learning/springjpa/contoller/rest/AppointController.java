package io.pragra.learning.springjpa.contoller.rest;

import io.pragra.learning.springjpa.domain.entities.Appointment;
import io.pragra.learning.springjpa.repo.ApptRepo;
import io.pragra.learning.springjpa.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointController {
    private AppointmentService service;

    public AppointController(AppointmentService service) {
        this.service = service;
    }

    @GetMapping("/appointment")
    public List<Appointment> getAllAppointment() {
        return this.service.findAll();
    }

    @GetMapping("/appointment/{id}")
    public Appointment getById(@PathVariable int id) {
        return this.service.getByID(id);
    }

    @GetMapping("/appointment/doctor/{name}")
    public List<Appointment> getById(@PathVariable String name) {
        return this.service.getAllForADoctor(name);
    }


    @PostMapping("/appointment")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return this.service.createAppoint(appointment);
    }


}
