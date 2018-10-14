package ssru.myw.springboot01.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import ssru.myw.springboot01.demo.bean.Cat;

public interface Cat2Repository extends Repository<Cat, Integer> {

    /**
     * 查询方法 根据catName 查询
     */
    public Cat findByCatName(String catName);


    /**
     * 根据id查
     * @param id
     * @return
     */

    public Cat findById( Integer id);

    /**
     * 如何编写jpq语句
     */
    @Query("from Cat where catName = :cn")
    public Cat findMyCatName(@Param("cn") String catName);

}
