package com.toricor.training.mapper;

import com.toricor.training.dao.Reservation;
import com.toricor.training.dao.ReservationUserEvent;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReservationMapper {

    @Select("SELECT * FROM reservation")
    List<Reservation> findAll();

    @Select("SELECT * FROM reservation WHERE id = #{id}")
    Reservation findOne(Integer id);

    @Select("SELECT reservation.id, user.name AS user_name, event.title AS event_name FROM reservation " +
            "INNER JOIN user ON user.id = reservation.user_id " +
            "INNER JOIN event ON event.id = reservation.event_id " +
            "ORDER BY reservation.id")
    List<ReservationUserEvent> findAllJoined();

    @Insert("INSERT INTO reservation(name) VALUES (#{name})")
    @Options(useGeneratedKeys = true)
    Reservation create(Reservation reservation);

    // TODO
    @Update("UPDATE")
    Reservation update(Reservation reservation);

    // TODO
    @Delete("DELETE")
    void delete(Integer id);

}
