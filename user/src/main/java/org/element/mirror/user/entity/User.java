package org.element.mirror.user.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 登录用户POJO
 *
 * @author dhtium
 */
@Setter
@Getter
@ToString
@Builder
public class User {
    private Integer id;
    private String name;
    private String password;
    private Date lastAccessTime;
    private Boolean enable;

}
