package com.tao.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName controller
 * @Descriiption 测试controller
 * @Author yanjiantao
 * @Date 2019/7/29 13:37
 **/

@Controller
public class IndexController {

    @RequestMapping("/*")
    public String index() {
        return "index";
    }
}
