package com.tmall.handler;

import com.tmall.Exception.NameOrPasswordException;
import com.tmall.Exception.UserExistException;
import com.tmall.Exception.UserNotExistException;
import com.tmall.bean.Ibatis;
import com.tmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 001117020012 on 2017/2/15.
 */
@RequestMapping("/user")
@Controller
public class UserHandler {
    @Autowired
    @Qualifier("UserServiceImpl")
    private IUserService service;

    /**
     * REST风格
     * @param name
     * @param password
     * @throws NameOrPasswordException  login
     * @throws UserNotExistException   login
     */
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public ModelAndView login(@RequestParam("name") String name,
                        @RequestParam("password")String password)
            throws NameOrPasswordException,UserNotExistException {
        service.login(name, password);
        List<Ibatis> users = service.queryAll();
        ModelAndView mad = new ModelAndView("success");
        //将数据存入modelMap
        mad.addObject("users", users);
        return mad;
    }

    @RequestMapping(value="/reg",method=RequestMethod.POST)
    public String reg(Ibatis user)
            throws UserExistException {
        service.reg(user);
        return "success";
    }

    public void test(){}
}
