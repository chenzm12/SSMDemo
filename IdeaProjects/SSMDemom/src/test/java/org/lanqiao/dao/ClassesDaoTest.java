package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by chen on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ClassesDaoTest {

    @Autowired
    ClassesDao classesDao;
    @Test
    public void findAllClass() throws Exception {
        System.out.println(classesDao.findAllClass());
    }


    @Test
    public void findInfoById() throws Exception {
        System.out.println(classesDao.findInfoById(1));
    }

}