package com.sansoft.checkpoint.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class AccessLevel {
    @Id
    private Long id;
    private String description;
}
