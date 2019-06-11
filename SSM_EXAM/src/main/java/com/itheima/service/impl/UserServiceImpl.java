package com.itheima.service.impl;

import com.itheima.bean.User;
import com.itheima.dao.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author fyj
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper ;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly=true)
    @Override
    public User login(String name ,String password){
        return  userMapper.findByNameAndPassword(name,password) ;
    }
}
