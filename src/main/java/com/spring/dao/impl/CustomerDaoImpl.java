package com.spring.dao.impl;

import com.spring.dao.CustomerDao;

/**
 * @author sanduo
 * @date 2018/05/16
 */
public class CustomerDaoImpl implements CustomerDao {

    /* Java config
     * @see com.spring.dao.CustomerDao#sayJavaConfig(java.lang.String)
     */
    @Override
    public String sayJavaConfig(String str) {

        return "你好：" + str;
    }

}
