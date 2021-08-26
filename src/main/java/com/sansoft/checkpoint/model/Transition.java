package com.sansoft.checkpoint.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Transition {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class IdTransition implements Serializable{
        private long idTransition;
        private long idUser;
    }
    @Id
    @EmbeddedId
    private IdTransition id;
    private LocalDateTime entryDate;
    private LocalDateTime exitDate;
    private BigDecimal period;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;
}
