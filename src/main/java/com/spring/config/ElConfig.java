package com.spring.config;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * el配置类
 * 
 * @author sanduo
 * @date 2018/05/16
 */
@Configuration
@ComponentScan("com.spring.service.el")
@PropertySource("classpath:com/spring/service/el/version.properties")
public class ElConfig {

    @Value("I love you!")
    private String nomal;

    @Value("#{systemProperties['os.name']}")
    private double osName;

    @Value("#{T{java.lang.Math}.random() * 100.0}")
    private double randomName;

    @Value("#{Elservice.another}")
    private String fromAnother;

    @Value("classpath:com/spring/service/el/version.properties")
    private Resource testfile;

    @Value("http:www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(nomal);
            System.out.println(osName);
            System.out.println(randomName);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testfile.getInputStream(), Charset.defaultCharset()));
            System.out.println(IOUtils.toString(testUrl.getInputStream(), Charset.defaultCharset()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
