package com.jsc.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = {"com.jsc.service"})
public class GlobalExceptionHandler {
    //捕获运行期异常，交由GlobalExceptionHandler处理
    @ExceptionHandler(RuntimeException.class)
    //设置返回json数据
    @ResponseBody
    public Map<String,Object> exceptionHandler(){
        Map<String,Object> map=new HashMap<>();
        map.put("errorCode","101");
        map.put("errorMsg","系统错误!");
        return map;
    }




}
