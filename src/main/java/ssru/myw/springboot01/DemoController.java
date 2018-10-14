package ssru.myw.springboot01;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/likeName")
    public List<Demo> likeName(String name) {
        PageHelper.startPage(2, 2);
        return demoService.likeName(name);

    }

    @RequestMapping("/save11")
    public Demo save() {
        Demo demo = new Demo();
        demo.setName("sss");


        demoService.save(demo);
        return demo;

    }
}
