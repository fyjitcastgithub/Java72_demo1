package com.itheima.dao;

import com.itheima.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 */
public interface UserMapper {
    /**
     * 根据用户名和密码查询用户信息
     * @param name
     * @param password
     * @return
     */
    public User findByNameAndPassword(@Param("name") String name , @Param("password") String password);
}
