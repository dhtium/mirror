package org.element.mirror.user.action;

import org.element.mirror.user.entity.User;
import org.element.mirror.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 返回单个用户
     *
     * @param id 查询的用户id
     * @return 返回的为数据，json
     */
    @ResponseBody
    @GetMapping(path = "{userId}")
    public User getUser(@PathVariable("userId") Integer id) {
        User user = userService.getUser(id);
        System.out.println("查询到：" + user);
        return user;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addUser(@RequestBody User user) {
        userService.saveUser(user);
        System.out.println(user);
        return "userList";
    }

}
