package com.johuer.controller;

import com.johuer.domain.Page;
import com.johuer.domain.User;
import com.johuer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua
 * @create 2016-11-07-20:34
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getAll")
    @ResponseBody
    public List<User> getAll(User user) {
        List<User> list = userService.getAll(user);
        return list;
    }

    @RequestMapping("getByPage")
    @ResponseBody
    public List<User> getByPage(Integer pageNo, Integer pageSize) {
        List<User> list = userService.getByPage(pageNo, pageSize);
        return list;
    }

    @RequestMapping("getByPageObj")
    @ResponseBody
    public List<User> getByPageObj(Page page) {
        List<User> list = userService.getByPageObj(page);
        return list;
    }
}
