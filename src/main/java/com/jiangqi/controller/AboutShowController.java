package com.jiangqi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>关于我界面显示控制器</p>
 *
 * @author 江七
 * @date 2021/5/14 11:03.
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}