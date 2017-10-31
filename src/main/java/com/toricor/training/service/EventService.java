package com.toricor.training.service;

import com.toricor.training.domain.Event;
import com.toricor.training.mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EventService {
    @Autowired
    EventMapper eventMapper;

    public List<Event> findAll() {
        return eventMapper.findAll();
    }

    public Event findOne(Integer id) {
        return eventMapper.findOne(id);
    }

    public void create(Event event) {
        eventMapper.create(event);
    }

    public void update(Event event) {
        eventMapper.update(event);
    }

    public void delete(Integer id) {
        eventMapper.delete(id);
    }
}
