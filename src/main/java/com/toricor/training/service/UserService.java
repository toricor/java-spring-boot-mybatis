package com.toricor.training.service;

import com.toricor.training.dao.User;
import com.toricor.training.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public User findOne(Integer id) {
        return userMapper.findOne(id);
    }

    public User create(User user) {
        return userMapper.create(user);
    }

    public User update(User user) {
        return userMapper.update(user);
    }

    public void delete(Integer id) {
        userMapper.delete(id);
    }
}
