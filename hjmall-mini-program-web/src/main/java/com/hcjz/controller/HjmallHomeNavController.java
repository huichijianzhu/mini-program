package com.hcjz.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hcjz.common.result.CommonReturnType;
import com.hcjz.pojo.HjmallHomeNav;
import com.hcjz.service.HjmallHomeNavService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homenav")
public class HjmallHomeNavController {
    @Reference
    private HjmallHomeNavService hjmallHomeNavService;

    @RequestMapping(value = "/list")
    public CommonReturnType list(@RequestParam(value = "pageNum",required = false,defaultValue = "0") Integer pageNum,
                                 @RequestParam(value = "pageSize",required = false,defaultValue = "") Integer pageSize) {
        return hjmallHomeNavService.selectList(pageNum,pageSize);
    }

    @RequestMapping(value = "/delete/{id}")
    public CommonReturnType deleteById(@PathVariable Integer id) {
        hjmallHomeNavService.deleteFakeById(id);
        return CommonReturnType.creat(null);
    }

    @RequestMapping(value = "/insert")
    public CommonReturnType insert(HjmallHomeNav hjmallHomeNav) {
        hjmallHomeNavService.insertByHomeNav(hjmallHomeNav);
        return CommonReturnType.creat(null);
    }

    @RequestMapping(value = "/update")
    public CommonReturnType updateByPojo(HjmallHomeNav hjmallHomeNav) {
        hjmallHomeNavService.updateByHomeNav(hjmallHomeNav);
        return CommonReturnType.creat(null);
    }
}
