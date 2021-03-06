package com.toricor.training.mapper;

import com.toricor.training.domain.Event;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EventMapper {

    @Select("SELECT * FROM event")
    List<Event> findAll();

    @Select("SELECT * FROM event WHERE id = #{id}")
    Event findOne(@Param("id") Integer id);

    @Insert("INSERT INTO event(title) VALUES (#{title})")
    @Options(useGeneratedKeys = true)
    void create(Event event);

    @Update("UPDATE event SET " +
            "title = #{title}, " +
            "description = #{description}, " +
            "author = #{author}, " +
            "place = #{place}, " +
            "participants = #{participants}, " +
            "max_participants = #{max_participants}, " +
            "created_at = #{created_at}, " +
            "published_at = #{published_at}" +
            "WHERE id = #{id}")
    void update(Event event);

    @Delete("DELETE FROM event WHERE id = #{id}")
    void delete(@Param("id") Integer id);

}
