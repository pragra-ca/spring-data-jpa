package io.pragra.learning.springjpa.repo;

import io.pragra.learning.springjpa.domain.entities.Appointment;

import javax.persistence.EntityManager;

public class AppointmentRepo {


    private EntityManager entityManager;

    public AppointmentRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Appointment createAppointMent(Appointment appointment) {
         entityManager.persist(appointment);
         return appointment;
    }
}
