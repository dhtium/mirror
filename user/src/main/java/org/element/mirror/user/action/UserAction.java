package org.element.mirror.user.action;

import org.element.mirror.user.entity.User;
import org.element.mirror.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> listUser(@RequestBody Map<String, Object> map) {
        System.out.println(map + "===========");
        ModelAndView mv = new ModelAndView("userList");
        List<User> users = userService.listUser(map);
        mv.addObject(users);
        return users;
    }

    /**
     * 返回单个用户
     *
     * @param id 查询的用户id
     * @return 返回的为数据，json
     */
    @GetMapping(path = "{userId}")
    @ResponseBody
    public User getUser(@PathVariable("userId") Integer id, @CookieValue("JSESSIONID") String sessionId) {
        System.out.println(sessionId);
        return userService.getUser(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody User user, HttpServletRequest request) {
        System.out.println(request.getRemoteAddr());
        userService.saveUser(user);
    }

    @PutMapping()
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping(value = "{userId}")
    public void deleteUser(@PathVariable("userId") Integer id) {
        Map<String, Object> deleteMap = new HashMap<>();
        deleteMap.put("id", id);
        userService.removeUser(deleteMap);
    }


}
