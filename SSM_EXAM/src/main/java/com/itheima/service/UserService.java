package com.itheima.service;

import com.itheima.bean.User;

/**
 * @Author fyj
 */
public interface UserService {

    /**
     * 用户登录
     * @param name
     * @param password
     * @return
     */
    public User login(String name , String password);
}
