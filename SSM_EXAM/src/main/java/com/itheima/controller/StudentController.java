package com.itheima.controller;

import com.itheima.bean.Student;
import com.itheima.bean.User;
import com.itheima.service.StudentService;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author fyj
 */
@Controller
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService ;

    /**
     * 查询所有学员信息
     * @return
     */
    @RequestMapping(path = "/all",method = RequestMethod.GET)
    public String findAll(Model model){
        List<Student> students = studentService.findAll();
        model.addAttribute("students",students);
        return "list";
    }
}
