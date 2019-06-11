package com.itheima.service;

import com.itheima.bean.Student;

import java.util.List;

/**
 * @Author fyj
 */
public interface StudentService {

    /**
     * 查询所有学生信息
     * @return
     */
    public List<Student> findAll();
}
