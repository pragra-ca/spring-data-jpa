package io.pragra.learning.springjpa.domain.entities;

import io.pragra.learning.springjpa.domain.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

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
    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    private String firstName;
    @Column(name = "LAST_NAME", columnDefinition = "VARCHAR2(3000)")
    private String lastName;
    private String phoneNumber;
    private Instant appointmentDate;
    private StatusEnum status;
    private Instant createDate ;
    private Instant updateUpdate;
    private String doctorName;

    @Transient
    private double appointmentFee;
}
// DAO // REPO

// SERVICE