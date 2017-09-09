package org.lanqiao.service.impl;

import org.lanqiao.bean.User;
import org.lanqiao.dao.IUserDao;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chen on 2017/8/30.
 */
@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    public List<User> getAllUser() {
        return userDao.findAllUser();
    }

    public List<User> getUserByCondition(User user) {
        return userDao.findUserByCondition(user);
    }

    public List<User> findUserCondition(User user){
        return userDao.getUserByCondition(user);
    }

    public void addUserService(User user) {
        userDao.addUser(user);
    }

    public void updateUserService(User user) {
        userDao.updateUser(user);
    }

}
