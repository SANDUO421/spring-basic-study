package com.spring.conditional;

import org.springframework.stereotype.Service;

/**
 * windows下创建bean
 * 
 * @author sanduo
 * @date 2018/05/17
 */
@Service
public class WindowsListService implements ListService {

    /* 显示命令
     * @see com.spring.conditional.ListService#showListCmd()
     */
    @Override
    public String showListCmd() {

        return "dir";
    }

}
