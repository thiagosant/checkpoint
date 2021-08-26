package com.sansoft.checkpoint.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Locality {
    @Id
    private Long id;
    @ManyToOne
    private AccessLevel accessLevel;
    private String description;
}
