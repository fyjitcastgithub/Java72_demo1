package com.itheima.service.impl;

import com.itheima.bean.Student;
import com.itheima.dao.StudentMapper;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author fyj
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper ;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly=true)
    @Override
    public List<Student> findAll(){
        return studentMapper.findAll();
    }
}
