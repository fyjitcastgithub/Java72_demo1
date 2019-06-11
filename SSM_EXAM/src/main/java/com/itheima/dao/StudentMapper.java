package com.itheima.dao;

import com.itheima.bean.Student;

import java.util.List;

/**
 * @Author fyj
 */
public interface StudentMapper {

    /**
     * 查询所有学员信息
     * @return
     */
    public List<Student> findAll();
}
