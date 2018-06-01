package com.spring.service.impl;

import com.spring.dao.CustomerDao;
import com.spring.service.CustomerService;

/**
 * java COnfig
 * 
 * @author sanduo
 * @date 2018/05/16
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    /**
     * 注入
     * 
     * @param customerDao the customerDao to set
     * @return
     */
    public void setCustomerDao(CustomerDao customerDao) {

        this.customerDao = customerDao;
    }

    /* j
     * ava Config
     * @see com.spring.service.CustomerService#sayJavaConfig(java.lang.String)
     */
    @Override
    public String sayJavaConfig(String str) {

        return customerDao.sayJavaConfig(str);
    }

}
