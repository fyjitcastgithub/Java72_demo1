package com.itheima.log;

import com.itheima.bean.SysLog;
import com.itheima.bean.User;
import com.itheima.dao.SysLogMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

/**
 * @Author fyj
 */
@Component
@Aspect
public class LogAop {

    @Autowired
    private SysLogMapper sysLogMapper ;

    private static Log log = LogFactory.getLog(LogAop.class);

    /**
     * 定义登录的切入点表达式
     */
    @Pointcut("execution(* com.itheima.service.UserService.login(..))")
    public void loginPt(){};

    @AfterReturning(pointcut = "loginPt()",returning="user")
    public void around(JoinPoint pjp, User user){
        //获取用户登录参数
        Object[] args = pjp.getArgs();
        //获取用户名
        String name = (String) args[0];

        Calendar calendar = Calendar.getInstance();

        log.trace("用户开始执行登录操作,用户名:"+name);

        String status = "0" ;
        
        if(user!=null){
            status = "1" ;
        }

        //封装日志数据
        SysLog sysLog = new SysLog();
        sysLog.setName(name);
        sysLog.setStatus(status);
        sysLog.setOp_time(new Date());

        //保存日志
        sysLogMapper.add(sysLog);

        log.trace("用户登录完成,用户名:"+name+",登录"+(status.equals("1")?"成功":"失败") );
    }
}
