package org.element.mirror.user.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 登录用户，数据表名
 *
 * @author dhtium
 */
@Setter
@Getter
@ToString
public class UserDO {
    private Integer id;
    private String name;
    private String password;
    private Date lastAccessTime;
    private Boolean enable;

}
