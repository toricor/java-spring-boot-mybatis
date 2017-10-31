package com.toricor.training.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Reservation {
    private Integer id;
    private Integer user_id;
    private Integer event_id;
}
