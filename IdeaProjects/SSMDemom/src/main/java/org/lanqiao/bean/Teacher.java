package org.lanqiao.bean;

/**
 * Created by chen on 2017/9/4.
 */
public class Teacher {
    private Integer tId;
    private String tName;

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

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                '}';
    }
}
