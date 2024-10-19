package org.element.hydrogen.mirror.api;

import org.element.hydrogen.mirror.vo.request.user.UserAddRequest;
import org.element.hydrogen.mirror.vo.response.user.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dhtium
 * @since 2024-10-19 22:11:59
 */
public interface UserApi {

    @PostMapping("/user/add")
    boolean addUser(@RequestBody UserAddRequest request);


    @GetMapping("/user/get")
    UserInfo getUserInfo(@RequestParam("id") Long id);

}
