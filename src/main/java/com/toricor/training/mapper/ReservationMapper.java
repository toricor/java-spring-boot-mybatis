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
    Reservation findOne(@Param("id") Integer id);

    @Select("SELECT reservation.id, user.name AS user_name, event.title AS event_name FROM reservation " +
            "INNER JOIN user ON user.id = reservation.user_id " +
            "INNER JOIN event ON event.id = reservation.event_id " +
            "ORDER BY reservation.id")
    List<ReservationUserEvent> findAllJoined();

    // 更新系クエリの返り値はvoidにしないといけないようだ
    @Insert("INSERT INTO reservation(name) VALUES (#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void create(Reservation reservation);

    @Update("UPDATE reservation SET user_id = #{user_id}, event_id = #{event_id} WHERE id = #{id}")
    void update(Reservation reservation);

    @Delete("DELETE FROM reservation WHERE id = #{id}")
    void delete(@Param("id") Integer id);

}
