package com.johuer.dao;

import com.johuer.domain.User;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua
 * @create 2016-11-07-20:40
 */
public interface UserDao {

    List<User> getAll(User user);

    List<User> getByPage();

    List<User> getByPageObj();
}
