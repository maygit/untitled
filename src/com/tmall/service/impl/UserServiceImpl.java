package com.tmall.service.impl;

import com.tmall.Exception.NameOrPasswordException;
import com.tmall.Exception.UserNotExistException;
import com.tmall.bean.Ibatis;
import com.tmall.dao.Dao;
import com.tmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 001117020012 on 2017/2/15.
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {
    @Autowired
    private  Dao s;
    @Override
    public void login(String username, String password) throws UserNotExistException, NameOrPasswordException {
        Ibatis user = s.getByName(username);
        if(user == null){
            throw new UserNotExistException("用户不存在");
        }
        if(!password.equals(user.getPassword())){
            throw new NameOrPasswordException("用户名或密码错误！");
        }
    }

    @Override
    public void reg(Ibatis user) {

    }

    @Override
    public void modifyUser(int id, Ibatis user) {

    }

    @Override
    public void modifyUserPassword(int id, String password) {

    }

    @Override
    public List<Ibatis> queryAll() {
        List<Ibatis> users = s.getList();
        System.out.println(users);
        return users;
    }
}
