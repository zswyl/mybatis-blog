package com.jiangqi.controller;

import com.jiangqi.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>友链显示控制器</p>
 *
 * @author 江七
 * @date 2021/5/13 13:54.
 */
@Controller
public class FriendsShowController {

    @Autowired
    private FriendLinkService friendLinkService;

    @GetMapping("/friends")
    public String friends(Model model) {
        model.addAttribute("friendlinks", friendLinkService.listFriendLink());
        return "friends";
    }

}