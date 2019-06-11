package cn.itcast.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 自定义异常类
 * @ControllerAdvice
 * @ExceptionHandler
 * fyj
 */
public class CustomException extends  RuntimeException{

    private CommonCode commonCode;

    public CustomException(CommonCode commonCode){
        this.commonCode=commonCode;
    }

    public CommonCode getCommonCode() {
        return commonCode;
    }
}
