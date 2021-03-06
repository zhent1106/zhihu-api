package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.service.SpecialService;
import com.scs.soft.zhihu.api.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName SpecialController
 * @Description TODO
 * @Author 田震
 * @Date 2020/1/15
 **/

@RestController
@RequestMapping(value = "/api/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;

    /**
     * 展示最近专题
     * @return
     */
    @GetMapping
    public Result getRecent(){
        return Result.success(specialService.selectRecent());
    }

    /**
     * 展示所有专题
     * @return
     */
    @GetMapping(value = "/all")
    public  Result getAll(){
        return  Result.success(specialService.selectAll());
    }
//    @GetMapping("/page")
//    public  Result getByPage(int currentPage,int count){
//        return  Result.success(favoriteService.selectByPage(currentPage,count));
//    }
}