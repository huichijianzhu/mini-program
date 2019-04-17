package com.hcjz.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hcjz.common.result.CommonReturnType;
import com.hcjz.pojo.HjmallHomeBlock;
import com.hcjz.service.HjmallHomeBlockService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homeblock")
public class HjmallHomeBlockController {
    @Reference
    private HjmallHomeBlockService hjmallHomeBlockService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonReturnType list(@RequestParam(value = "pageNum",required = false,defaultValue = "0") Integer pageNum,
                                      @RequestParam(value = "pageSize",required = false,defaultValue = "") Integer pageSize) {
        return hjmallHomeBlockService.selectList(pageNum, pageSize);
    }

    @RequestMapping(value = "/delete/{id}")
    public CommonReturnType deleteById(@PathVariable Integer id) {
        return hjmallHomeBlockService.deleteFakeById(id);
    }

    @RequestMapping(value = "/insert")
    public CommonReturnType insertByPojo(HjmallHomeBlock hjmallHomeBlock) {
        return hjmallHomeBlockService.insertByHomeBlock(hjmallHomeBlock);
    }

    @RequestMapping(value = "/update")
    public CommonReturnType updateByPojo(HjmallHomeBlock hjmallHomeBlock) {
        return hjmallHomeBlockService.updateByHomeBlock(hjmallHomeBlock);
    }
}
