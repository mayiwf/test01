package ssru.myw.springboot01.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssru.myw.springboot01.demo.bean.Cat;
import ssru.myw.springboot01.demo.service.CatService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/cat")
public class CatController {
    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save() {
        Cat cat = new Cat();
        cat.setCatName("test");
        cat.setCatAge(11);
        catService.save(cat);
        return "save ok.";
    }

    @RequestMapping("/delete")
    public String delete() {
        catService.delete(1);
        return "delete ok.";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }

    @RequestMapping("/findByCatName")
    public Cat findByCatName(String catName) {
        return catService.findByCatName(catName);

    }

    @RequestMapping("/findByCatName2")
    public Cat findByCatName2(String catName) {
        return catService.findByCatName2(catName);

    }
    @RequestMapping("/findById")
    public Cat findById(Integer id) {
        return catService.findById(id);

    }
    @RequestMapping("/selectByCatName2Ssru")
    public Cat selectByCatName2(String catName) {
        return catService.selectByCatName2(catName);
    }
}