package com.sansoft.checkpoint.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class WorkingDay {
    private long id;
    private String description;

}
