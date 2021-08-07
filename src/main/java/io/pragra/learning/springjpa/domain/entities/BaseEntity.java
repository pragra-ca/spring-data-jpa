package io.pragra.learning.springjpa.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class BaseEntity {
    protected Instant createDate ;
    protected Instant updateUpdate;
}
