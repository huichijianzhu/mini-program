package com.hcjz.controller;

import com.hcjz.common.result.BusinessException;
import com.hcjz.common.result.CommonReturnType;
import com.hcjz.exception.MyException;
import com.hcjz.pojo.HjmallHomeBlock;
import com.hcjz.service.HjmallHomeBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/homeblock")
public class HjmallHomeBlockController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @Autowired
    private HjmallHomeBlockService hjmallHomeBlockService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonReturnType list(@RequestParam(value = "pageNum",required = false,defaultValue = "0") Integer pageNum,
                                 @RequestParam(value = "pageSize", required = false, defaultValue = "") Integer pageSize) throws BusinessException {
//        System.out.println(5/0);
        return hjmallHomeBlockService.selectList(pageNum, pageSize);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public CommonReturnType deleteById(@PathVariable Integer id) {
        return hjmallHomeBlockService.deleteFakeById(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public CommonReturnType insertByPojo(HjmallHomeBlock hjmallHomeBlock) {
        return hjmallHomeBlockService.insertByHomeBlock(hjmallHomeBlock);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonReturnType updateByPojo(HjmallHomeBlock hjmallHomeBlock) {
        return hjmallHomeBlockService.updateByHomeBlock(hjmallHomeBlock);
    }

    @RequestMapping(value = "/home")
    public String home() throws Exception {
        System.out.println(10/0);
//        throw new Exception("Sam 错误");
        throw new MyException("101");

    }

    @RequestMapping(value = "/error")
    public Map<String,Object> error() {
        Map<String,Object> result=new HashMap<String,Object>();
        result.put("message", "not found!");
        result.put("code", 404);
        return result;
    }

    @RequestMapping("/ee")
    public Map<String,Object> testexception() {
        Map<String,Object> result=new HashMap<String,Object>();
        result.put("message", "testexception!");
        result.put("code", 111);
        return result;
    }


}
