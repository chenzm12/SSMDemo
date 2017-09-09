package org.lanqiao.dao;

import org.lanqiao.bean.ClassNum;
import org.lanqiao.bean.Classes;

import java.util.List;

/**
 * Created by chen on 2017/9/4.
 */
public interface ClassesDao {
    /**
     * 查询所有
     * @return
     */
    public List<Classes> findAllClass();

    /**
     * 根据班级Id查询学生老师信息
     * @return
     */
    public List<ClassNum> findInfoById(Integer cId);
}
