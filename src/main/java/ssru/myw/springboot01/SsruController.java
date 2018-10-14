package ssru.myw.springboot01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/ssru")
public class SsruController {
    @RequestMapping("/index1")
    public String index(Map<String, Object> map) {
        map.put("name", "Andy");
        return "index";
    }
}
