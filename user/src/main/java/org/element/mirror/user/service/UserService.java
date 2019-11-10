package org.element.mirror.user.service;

import org.element.mirror.user.entity.UserDTO;

import java.util.List;
import java.util.Map;

/**
 * @author dhtium
 */
public interface UserService {
    /**
     * 返回业务bean
     *
     * @param id 查询主键
     * @return userDTO
     */
    UserDTO getUserDTO(Integer id);

    /**
     * 返回多个业务bean
     *
     * @param queryCondition 查询条件
     * @return list<UserDTO>
     */
    List<UserDTO> listUserDTO(Map<String, Object> queryCondition);

    /**
     * 返回查询的用户数
     *
     * @param queryCondition 查询条件
     * @return 返回用户数
     */
    Integer countUserDTO(Map<String, Object> queryCondition);

    /**
     * 保存用户
     *
     * @param userDTO 业务bean
     * @return 返回插入后的用户
     */
    UserDTO saveUserDTO(UserDTO userDTO);

    /**
     * 删除用户
     *
     * @param userDTO 业务bean
     * @return 返回删除的用户
     */
    UserDTO removeUserDTO(UserDTO userDTO);

    /**
     * 修改用户信息
     *
     * @param userDTO 业务bean
     * @return 修改后的用户信息
     */
    UserDTO updateUserDTO(UserDTO userDTO);


}
