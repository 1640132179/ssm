package com.itheima.ssm.service;

import com.itheima.ssm.domain.SysLog;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface ISysLogService {
    public void save (SysLog sysLog) throws Exception;


    List<SysLog> findAll(Integer page,Integer size) throws Exception;
}
