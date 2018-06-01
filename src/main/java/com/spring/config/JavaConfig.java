package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.dao.CustomerDao;
import com.spring.dao.impl.CustomerDaoImpl;
import com.spring.service.CustomerService;
import com.spring.service.impl.CustomerServiceImpl;

/**
 * @author sanduo
 * @date 2018/05/16
 */
@Configuration
public class JavaConfig {

    @Bean
    public CustomerDao customer() {

        return new CustomerDaoImpl();
    }

    /**
     * 第一种注入方式
     * 
     * @return
     */
    @Bean
    public CustomerService customerService() {

        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerDao(customer());

        return customerService;
    }

    /**
     * 第二种注入方式
     * 
     * @param customerDao
     * @return
     */

    @Bean
    public CustomerService customerService(CustomerDao customerDao) {

        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerDao(customerDao);

        return customerService;
    }
}
