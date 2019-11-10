package org.element.mirror.user.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 业务域
 *
 * @author dhtium
 */
@Setter
@Getter
@ToString
public class UserDTO {
    private Integer id;
    private String name;
    private String password;
    private Date lastAccessTime;
    private Boolean enable;
}
