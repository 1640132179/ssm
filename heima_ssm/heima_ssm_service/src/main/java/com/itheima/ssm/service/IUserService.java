package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {

    List<UserInfo> findAll()throws Exception;
//
   UserInfo findById(String id) throws Exception;

    void save(UserInfo userInfo)throws Exception;

    List<Role> findOtherRole(String userid) throws Exception;


    void addRoleToUser(String userId, String[] roleIds);
}
