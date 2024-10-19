package org.element.hydrogen.mirror.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.element.hydrogen.mirror.entity.po.UserPO;

/**
 * @author dhtium
 * @since 2024-10-19 22:47:49
 */
@Mapper
public interface UserMapper extends BaseMapper<UserPO> {
}
