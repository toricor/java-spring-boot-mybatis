package com.toricor.training.mapper;

import com.toricor.training.dao.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> findAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    User findOne(@Param("id") Integer id);

    // TODO
    @Insert("INSERT INTO user(name) VALUES (#{name})")
    @Options(useGeneratedKeys = true)
    User create(User user);

    // TODO
    @Update("UPDATE")
    User update(User user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void delete(@Param("id") Integer id);

}
