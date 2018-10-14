package ssru.myw.springboot01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello() {




        return "Hello World! this is hot deployment " +
                "";

    }

    /**
     * spring 默认的解析框架是json
     * @return
     */
    @RequestMapping("getDemo")
    public Demo getDemo() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("sss e");
        return demo;
    }




}
