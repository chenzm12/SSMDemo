package org.lanqiao.dao;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by chen on 2017/8/30.
 */
public interface IUserDao {

    public List<User> findAllUser();

    /**
     * 根据条件查询用户
     * @return
     */
    public List<User> findUserByCondition(User user);

    /**
     * 根据条件查询
     * @return
     */
    public List<User> getUserByCondition(User user);

    /**
     * 添加用户
     * @param user
     */
    public void addUser(User user);

    /**
     * 修改用户
     * @param user
     */
    public void updateUser(User user);
}
