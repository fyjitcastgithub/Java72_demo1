package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.exception.CommonCode;
import cn.itcast.exception.CustomException;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        model.addAttribute("list",accountService.findAll());
        return "list";
    }

    @RequestMapping("/findAll2")
    @ResponseBody
    public CommonCode findAll2(){
        if(true){
            throw new CustomException(new CommonCode(CommonCode.PARAM));
        }
        return new CommonCode("操作成功");
    }


    @RequestMapping("/findAll3")
    public String findAll3(Model model){
         int a=1/0;
        model.addAttribute("list",accountService.findAll());
        return "list";
    }

}
