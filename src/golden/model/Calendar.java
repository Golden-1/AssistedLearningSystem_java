package golden.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class Calendar {
    private Integer id;

    private Integer studentId;

    private Integer sumSignInNum;

    private Integer maxSignInNum;

    private Integer num;

    private String calendarcol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getSumSignInNum() {
        return sumSignInNum;
    }

    public void setSumSignInNum(Integer sumSignInNum) {
        this.sumSignInNum = sumSignInNum;
    }

    public Integer getMaxSignInNum() {
        return maxSignInNum;
    }

    public void setMaxSignInNum(Integer maxSignInNum) {
        this.maxSignInNum = maxSignInNum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Object getCalendarcol() {
        JSONArray calendar=JSON.parseArray(this.calendarcol);
    	return calendar;
    }

    public void setCalendarcol(String calendarcol) {
        this.calendarcol = calendarcol;
    }
}