package org.element.mirror.user.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 页面展示的域
 *
 * @author dhtium
 */
@Getter
@Setter
@ToString
public class UserVO {
    private Integer id;
    private String name;
    private String password;
    private Date lastAccessTime;
    private Boolean enable;
}
