package com.toricor.training.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class Event {
    private Integer id;
    private String title;
    private String description;
    private Integer author;
    private String place;
    private Integer participants;
    private Integer max_participants;
    private Timestamp created_at;
    private Timestamp published_at;
}

