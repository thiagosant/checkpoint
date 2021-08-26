package com.sansoft.checkpoint.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class AnnualLeave {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class IdAnnualLeave implements Serializable{
        private long idAnnualLeave;
        private long idTransition;
        private long idUser;
    }
    @Id
    @EmbeddedId
    private IdAnnualLeave id;
    private LocalDateTime dateWorked;
    private BigDecimal amountHours;
    private BigDecimal hoursBalance;


}
