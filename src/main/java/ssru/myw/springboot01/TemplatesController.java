package ssru.myw.springboot01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/templates")

public class TemplatesController {
    @RequestMapping("/hello")
    public String hello(Map<String, Object> map) {
        // 正常返回的是ModelAndView
        map.put("name", "Andy");
        return "hello";


    }

    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String, Object> map) {
        map.put("name", "andy");
        return "helloFtl";
    }
}
