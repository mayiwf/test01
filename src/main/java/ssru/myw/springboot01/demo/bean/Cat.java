package ssru.myw.springboot01.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 使用entity注解的时候，会在对应的数据库中生成表
 * 如何指定主键，及主键的生成策略
 */
@Entity
public class Cat {
    /**
     * 使用id 指定主键
     * 使用 GeneratedValue 指定主键的生成策略
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String catName;
    private int catAge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }
}
