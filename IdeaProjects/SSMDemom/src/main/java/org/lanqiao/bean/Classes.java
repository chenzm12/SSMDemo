package org.lanqiao.bean;

/**
 * Created by chen on 2017/9/4.
 */
public class Classes {
    private Integer tId;
    private String tName;
    private Course course;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", course=" + course +
                '}';
    }
}
