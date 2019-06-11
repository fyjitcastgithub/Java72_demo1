package com.itheima.interceptors;

import com.itheima.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author fyj
 */
@Component
public class AuthorityInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();  
        User user = (User) session.getAttribute("logiend");
        //判断用户是否是登录状态
        if(user==null){
            //用户未登录
            response.sendRedirect(request.getContextPath()+"/denied.jsp");
            return false ;
        }

        return true;
    }
}
