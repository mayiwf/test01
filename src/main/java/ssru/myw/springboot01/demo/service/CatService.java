package ssru.myw.springboot01.demo.service;

import org.springframework.stereotype.Service;
import ssru.myw.springboot01.demo.bean.Cat;
import ssru.myw.springboot01.demo.dao.CatDao;
import ssru.myw.springboot01.demo.repository.Cat2Repository;
import ssru.myw.springboot01.demo.repository.CatRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;



@Service
public class CatService {

    @Resource
    private CatRepository catRepository;
    @Resource
    private Cat2Repository catRepository2;

    @Resource
    private CatDao catDao;
    @Transactional
    public void save(Cat cat) {
        catRepository.save(cat);

    }
    @Transactional
    public void delete(int id) {
        catRepository.deleteById(id);

    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }

    public Cat findByCatName(String catName) {
        return catRepository2.findByCatName(catName);
    }
    public Cat findByCatName2(String catName) {
        return catRepository2.findMyCatName(catName);
    }
    public Cat findById(Integer id) {
        return catRepository2.findById(id);
    }

    public Cat selectByCatName2(String catName) {
        return catDao.slelteByCatName(catName);



    }

}
