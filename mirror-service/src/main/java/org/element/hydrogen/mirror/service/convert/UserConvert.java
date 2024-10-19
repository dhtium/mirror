package org.element.hydrogen.mirror.service.convert;

import org.element.hydrogen.mirror.entity.po.UserPO;
import org.element.hydrogen.mirror.vo.response.user.UserInfo;
import org.springframework.stereotype.Component;

/**
 * @author dhtium
 * @since 2024-10-19 22:55:20
 */
@Component
public class UserConvert {

    public UserInfo convert2Info(UserPO userPO) {
        UserInfo info = new UserInfo();
        info.setId(userPO.getId());
        info.setName(userPO.getName());
        userPO.setPassword(userPO.getPassword());
        return info;
    }

}
