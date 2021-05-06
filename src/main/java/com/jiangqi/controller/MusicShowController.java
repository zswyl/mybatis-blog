package com.jiangqi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>音乐盒页面显示控制器</p>
 *
 * @author 江七
 * @date 2021/5/13 10:53.
 */
@Controller
public class MusicShowController {

    @GetMapping("/music")
    public String about() {
        return "music";
    }

}