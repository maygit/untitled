package com.tmall.service;

import com.tmall.Exception.NameOrPasswordException;
import com.tmall.Exception.UserNotExistException;
import com.tmall.bean.Ibatis;

import java.util.List;

/**
 * Created by 001117020012 on 2017/2/15.
 */
public interface IUserService {
    //登陆的方法
    public void login(String username, String password)
            throws UserNotExistException,NameOrPasswordException;

    //注册
    public void reg(Ibatis user);

    //修改用户信息
    public void modifyUser(int id ,Ibatis user);

    //修改密码
    public void modifyUserPassword(int id, String password);

    //查询用户
    public List<Ibatis> queryAll();

}
