package ssru.myw.springboot01;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 这是一个测试实体类
 */
public class Demo {
    private int id;
    private String name;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
