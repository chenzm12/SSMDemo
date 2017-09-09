package org.lanqiao.controller;

import org.lanqiao.bean.User;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chen on 2017/9/1.
 */
@Controller
@RequestMapping("/test")
public class helloController {
    @Autowired
    private IUserService IUserService;
    //查询所有用户
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public List<User> hello(){
        List<User> list=IUserService.getAllUser();
        return list;
    }

    @RequestMapping("/basType.do")
    @ResponseBody
    public String basType(Integer num){
        return num+"";
    }

    @RequestMapping("/condition.do")
    public ModelAndView modelAndView(User user){
        List<User> list=IUserService.getUserByCondition(user);
        Map<String,List> map=new HashMap<String, List>();
        map.put("list",list);
        return new ModelAndView("show",map);
    }
    @RequestMapping("/cond.do")
    public ModelAndView modelAndViews(User user){
        List<User> list=IUserService.findUserCondition(user);
        Map<String,List> map=new HashMap<String, List>();
        map.put("list",list);
        return new ModelAndView("show",map);
    }

    //添加用户
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public void addView(@RequestBody User user){
        IUserService.addUserService(user);
    }

    //修改用户
    @RequestMapping(value = "",method = RequestMethod.PUT)
    @ResponseBody
    public void updateView(@RequestBody User user){
        IUserService.updateUserService(user);
    }
}
