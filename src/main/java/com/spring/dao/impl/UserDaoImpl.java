package com.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.spring.dao.UserDao;

/**
 * @author sanduo
 * @date 2018/05/16
 */
@Repository
public class UserDaoImpl implements UserDao {

    /* 查询
     * @see com.spring.dao.UserDao#saySpring(java.lang.String)
     */
    @Override
    public String saySpring(String str) {

        return "你好：" + str;
    }

}
