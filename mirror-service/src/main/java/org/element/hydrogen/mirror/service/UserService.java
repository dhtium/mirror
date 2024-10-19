package org.element.hydrogen.mirror.service;

import jakarta.annotation.Resource;
import org.element.hydrogen.mirror.entity.po.UserPO;
import org.element.hydrogen.mirror.service.convert.UserConvert;
import org.element.hydrogen.mirror.service.repository.UserRepository;
import org.element.hydrogen.mirror.vo.response.user.UserInfo;
import org.springframework.stereotype.Component;

/**
 * @author dhtium
 * @since 2024-10-19 22:48:22
 */
@Component
public class UserService {

    @Resource
    private UserConvert userConvert;
    @Resource
    private UserRepository userRepository;

    public UserInfo getById(Long id) {
        UserPO userPO = userRepository.getById(id);
        return userConvert.convert2Info(userPO);
    }

}
