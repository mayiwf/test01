package ssru.myw.springboot01.demo.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 1,先建一个class，
 * 2,添加注解
 * 3,在class中添加一个方法
 * 4,在方法中添加注解拦截相应的异常信息。
 * 5，如果方法的返回值是view 方法的返回值是ModelAndView
 * 6，如果返回的是String或者json数据，那么需要在方法上添加@RequestBody注解
 *
 */
@ControllerAdvice
public class GlobalDefaultExceptionhandler {
    public GlobalDefaultExceptionhandler() {
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest request, Exception e) {
        // 返回的String
        return "对不起，服务器很忙，请稍后再试！";


    }

}
