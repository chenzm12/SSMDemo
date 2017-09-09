package org.lanqiao.bean;

import java.util.List;

/**
 * Created by chen on 2017/9/4.
 */
public class ClassNum {
    private Integer cId;
    private List<Student> studentList;
    private Teacher teacher;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "ClassNum{" +
                "cId=" + cId +
                ", studentList=" + studentList +
                ", teacher=" + teacher +
                '}';
    }
}
