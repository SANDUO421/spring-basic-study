package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.service.UserService;

/**
 * @author sanduo
 * @date 2018/05/16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /* 
     * 测试配置
     * @see com.spring.service.UserService#saySpring(java.lang.String)
     */
    @Override
    public String saySpring(String str) {
        return userDao.saySpring(str);
    }

}
