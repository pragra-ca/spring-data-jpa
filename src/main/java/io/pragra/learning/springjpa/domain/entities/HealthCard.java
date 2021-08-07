package io.pragra.learning.springjpa.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class HealthCard {
    @Id
    private Long id;
    private String name;
    private Instant expiry;
}
