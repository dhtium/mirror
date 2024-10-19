package org.element.hydrogen.mirror.service.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.element.hydrogen.mirror.entity.po.UserPO;
import org.element.hydrogen.mirror.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @author dhtium
 * @since 2024-10-19 22:48:40
 */
@Repository
public class UserRepository extends ServiceImpl<UserMapper, UserPO> {

}
