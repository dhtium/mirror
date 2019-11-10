package org.element.mirror.user.action;

import org.element.mirror.user.entity.User;
import org.element.mirror.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dhtium
 */

@Controller
@RequestMapping("user")
public class UserAction {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("get")
    public User getUser(@RequestParam("id") Integer id) {
        User user = userService.getUser(id);
        System.out.println("查询到：" + user);
        return user;
    }

}
