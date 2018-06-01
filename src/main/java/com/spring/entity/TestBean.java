package com.spring.entity;

/**
 * 测试bean
 * 
 * @author sanduo
 * @date 2018/05/17
 */
public class TestBean {

    private String content;

    /**
     * 
     */
    public TestBean() {
        super();
    }

    /**
     * @param content
     */
    public TestBean(String content) {
        super();
        this.content = content;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

}
