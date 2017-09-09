package org.lanqiao.service;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by chen on 2017/8/30.
 */
public interface IUserService {
    public List<User> getAllUser();

    public List<User> getUserByCondition(User user);

    public List<User> findUserCondition(User user);

    /**
     * 添加用户
     * @param user
     */
    public void addUserService(User user);

    /**
     * 修改用户
     * @param user
     */
    public void updateUserService(User user);
}
