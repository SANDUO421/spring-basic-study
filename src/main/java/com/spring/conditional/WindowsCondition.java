package com.spring.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 条件
 * 
 * @author sanduo
 * @date 2018/05/17
 */
public class WindowsCondition implements Condition {

    /*条件创建
     * @see org.springframework.context.annotation.Condition#matches(org.springframework.context.annotation.ConditionContext, org.springframework.core.type.AnnotatedTypeMetadata)
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata matadate) {

        return context.getEnvironment().getProperty("os.name").contains("windows");
    }

}
