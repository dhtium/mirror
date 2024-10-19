package org.element.hydrogen.mirror.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author dhtium
 * @since 2024-10-19 22:47:13
 */
@Data
@TableName(value ="t_mirror_user")
public class UserPO {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;

}
