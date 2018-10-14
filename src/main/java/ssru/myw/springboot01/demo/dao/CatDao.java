package ssru.myw.springboot01.demo.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ssru.myw.springboot01.demo.bean.Cat;

import javax.annotation.Resource;

/**
 * 使用注解注明这是一个持久化的类
 */
@Repository
public class CatDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Cat slelteByCatName(String catName) {

        /**
         *
         */
        String sql = "select * from cat where cat_name = ?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
        Cat cat = jdbcTemplate.queryForObject(sql, new Object[] {catName}, rowMapper);
        return cat;

    }
}
