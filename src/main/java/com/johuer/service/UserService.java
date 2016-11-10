package com.johuer.service;

import com.github.pagehelper.PageHelper;
import com.johuer.dao.UserDao;
import com.johuer.domain.Page;
import com.johuer.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua
 * @create 2016-11-07-20:39
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public List<User> getAll(User user) {
        return userDao.getAll(user);
    }

    public List<User> getByPage(Integer pageNo, Integer pageSize) {
        if (pageNo != null && pageSize != null) {
            PageHelper.startPage(pageNo, pageSize, "id");
        }
        return userDao.getByPage();
    }

    /**
     * http://localhost:8080/getByPageObj?pageSize=0
     * @param page pageSize=0 可以查询所有记录
     * @return
     */
    public List<User> getByPageObj(Page page) {
        if (page.getPageNo() != null && page.getPageSize() != null) {
            PageHelper.startPage(page.getPageNo(), page.getPageSize(), "id");
        }
        return userDao.getByPageObj();
    }
}
