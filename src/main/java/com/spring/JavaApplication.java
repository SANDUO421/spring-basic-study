
package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.JavaConfig;
import com.spring.service.CustomerService;

/**
 * @author sanduo
 * @date 2018/05/16
 */
public class JavaApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        CustomerService customerService = context.getBean(CustomerService.class);
        String result = customerService.sayJavaConfig("java config");
        System.out.println(result);
        context.close();
    }
}
