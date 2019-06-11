package com.itheima.dao;

import com.itheima.bean.SysLog;

/**
 * @Author fyj
 */
public interface SysLogMapper {

    /**
     * 保存日志信息
     * @param sysLog
     */
    public void add(SysLog sysLog);
}
