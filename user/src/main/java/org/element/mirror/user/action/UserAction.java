package org.element.mirror.user.action;

import org.element.mirror.user.entity.User;
import org.element.mirror.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dhtium
 */

@Controller
@RequestMapping("user")
public class UserAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserAction.class);

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
        LOGGER.info("This is the first logger from action : sessionId = {}", sessionId);
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
        Map<String, Object> deleteMap = new HashMap<>(1);
        deleteMap.put("id", id);
        userService.removeUser(deleteMap);
    }

    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        System.out.println(multipartFile.getOriginalFilename() + ":");
        File dir = new File("WEB-INF/upload");

        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                return "create file failed";
            }
        }
        System.out.println(dir.getAbsolutePath());
        multipartFile.transferTo(dir);
        return "success";
    }


}
