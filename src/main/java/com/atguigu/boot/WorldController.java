package com.atguigu.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshihao
 * @descript
 * @create 2022-12-10 15:38
 */
@RestController
public class WorldController {
    @RequestMapping("/w")
    public String world666(){
        return "World";
    }
}
