package com.toricor.training.service;

import com.toricor.training.dao.Reservation;
import com.toricor.training.dao.ReservationUserEvent;
import com.toricor.training.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReservationService {
    @Autowired
    ReservationMapper reservationMapper;

    public List<Reservation> findAll() {
        return reservationMapper.findAll();
    }

    public List<ReservationUserEvent> findAllJoined() {
        return reservationMapper.findAllJoined();
    }

    public Reservation findOne(Integer id) {
        return reservationMapper.findOne(id);
    }

    public Reservation create(Reservation reservation) {
        return reservationMapper.create(reservation);
    }

    public Reservation update(Reservation reservation) {
        return reservationMapper.update(reservation);
    }

    public void delete(Integer id) {
        reservationMapper.delete(id);
    }
}