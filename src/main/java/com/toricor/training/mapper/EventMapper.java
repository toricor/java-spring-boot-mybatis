package com.toricor.training.mapper;

import com.toricor.training.dao.Event;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EventMapper {

    @Select("SELECT * FROM event")
    List<Event> findAll();

    @Select("SELECT * FROM event WHERE id = #{id}")
    Event findOne(Integer id);

    @Insert("INSERT INTO event(title) VALUES (#{title})")
    @Options(useGeneratedKeys = true)
    Event create(Event event);

    // TODO
    @Update("UPDATE")
    Event update(Event event);

    // TODO
    @Delete("DELETE ")
    void delete(Integer id);

}
