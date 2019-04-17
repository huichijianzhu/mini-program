package com.hcjz.controller;

import com.hcjz.common.result.CommonReturnType;
import com.hcjz.pojo.HjmallHomeNav;
import com.hcjz.service.HjmallHomeNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homenav")
public class HjmallHomeNavController {
    @Autowired
    private HjmallHomeNavService hjmallHomeNavService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonReturnType list(@RequestParam(value = "pageNum",required = false,defaultValue = "0") Integer pageNum,
                                 @RequestParam(value = "pageSize",required = false,defaultValue = "") Integer pageSize) {
        return hjmallHomeNavService.selectList(pageNum,pageSize);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public CommonReturnType deleteById(@PathVariable Integer id) {
        hjmallHomeNavService.deleteFakeById(id);
        return CommonReturnType.creat(null);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public CommonReturnType insert(HjmallHomeNav hjmallHomeNav) {
        hjmallHomeNavService.insertByHomeNav(hjmallHomeNav);
        return CommonReturnType.creat(null);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonReturnType updateByPojo(HjmallHomeNav hjmallHomeNav) {
        hjmallHomeNavService.updateByHomeNav(hjmallHomeNav);
        return CommonReturnType.creat(null);
    }
}
