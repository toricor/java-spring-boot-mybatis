package com.toricor.training.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationUserEvent {
    private Integer id;
    private String user_name;
    private String event_name;
}