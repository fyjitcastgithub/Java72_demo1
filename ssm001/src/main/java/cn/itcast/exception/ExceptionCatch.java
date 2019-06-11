package cn.itcast.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * fyj
 */
@ControllerAdvice
public class ExceptionCatch {

    private static final Logger logger= LoggerFactory.getLogger(ExceptionCatch.class);


    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public CommonCode catchCustomException(CustomException ce){
       CommonCode commonCode= ce.getCommonCode();
       logger.error("发现异常："+commonCode.getMsg()+"。 时间："+new Date().toLocaleString(),ce);
       return commonCode;

    }

    // slf logforj  logback

    @ExceptionHandler(Exception.class)
    public String catchException(Exception ex, Model model){
        model.addAttribute("msg",ex.getMessage());
        logger.error("发现异常：{}。 时间："+new Date().toLocaleString(),ex.getMessage(),ex);
        return "error";
    }

}
