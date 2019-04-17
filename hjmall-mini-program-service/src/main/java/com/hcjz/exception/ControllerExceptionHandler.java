package com.hcjz.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerExceptionHandler {
    //这个注解是指当controller中抛出这个指定的异常类的时候，都会转到这个方法中来处理异常
    @ExceptionHandler(MyException.class)
    //将返回的值转成json格式的数据
    @ResponseBody
    //返回的状态码
   // @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)     //服务内部错误500
    public Map<String,Object> handlerCommonException(MyException ex){
        Map<String,Object> result=new HashMap<String,Object>();
//        result.put("message", ex.getErrMsg());
        result.put("message", "Mymessage");
//        result.put("code", ex.getErrCode());
//        System.out.println(ex.getErrMsg());
        System.out.println(ex.getMessage());
        return result;
    }

    //404
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> handlerUserNotExistException(Exception ex){
        Map<String,Object> result=new HashMap<String,Object>();
        result.put("message", "全局异常");
        result.put("code", 100);
        return result;
    }



}
