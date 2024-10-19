package org.element.hydrogen.mirror.controller;

import jakarta.annotation.Resource;
import org.element.hydrogen.mirror.api.UserApi;
import org.element.hydrogen.mirror.service.UserService;
import org.element.hydrogen.mirror.vo.request.user.UserAddRequest;
import org.element.hydrogen.mirror.vo.response.user.UserInfo;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dhtium
 * @since 2024-10-19 22:24:37
 */
@RestController
public class UserController implements UserApi {

    @Resource
    private UserService userService;

    @Override
    public boolean addUser(UserAddRequest request) {
        return false;
    }

    @Override
    public UserInfo getUserInfo(Long id) {
        return userService.getById(id);
    }
}
