package ssru.myw.springboot01.demo.repository;

import org.springframework.data.repository.CrudRepository;
import ssru.myw.springboot01.demo.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer> {

}
