package com.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.config.TestConfig;
import com.spring.entity.TestBean;

/**
 * 集成测试
 * 
 * @author sanduo
 * @date 2018/05/17
 */
@RunWith(SpringJUnit4ClassRunner.class) // 开启spring TestContext Framework
@ContextConfiguration(classes = TestConfig.class) // 加载配置classes，加载配置类
@ActiveProfiles("prod") // 激活Profile
public class BeanIntegrationTest {

    @Autowired
    private TestBean testBean;

    @Test
    public void ProdBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        // 校验是否是预期
        Assert.assertEquals(expected, actual);
    }
}
