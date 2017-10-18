package com.jx.service.impl;

import com.jx.bean.User;
import com.jx.dao.UserDAO;
import com.jx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by CHEN JX on 2017/10/18.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public User queryById(Integer id) {
        return  userDAO.queryById(id);
    }
}
