package io.pragra.learning.springjpa.domain.entities;

import io.pragra.learning.springjpa.domain.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "TABLE_APPT")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "visiting_patient_id")
    private Patient patient;
    private Instant appointmentDate;
    private StatusEnum status;

    @ManyToOne(targetEntity = Doctor.class, cascade = CascadeType.DETACH)
    private Doctor doctor;
    private Instant createDate;
    private Instant updateUpdate;
    @Transient
    private double appointmentFee;
}
// DAO // REPO

// SERVICE
