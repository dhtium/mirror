package org.element.mirror.user.dao;

import org.element.mirror.user.entity.UserDO;

import java.util.List;
import java.util.Map;

/**
 * 用户操作
 *
 * @author dhtium
 */
public interface UserDao {

    /**
     * 根据主键查询单个用户
     *
     * @param id 主键
     * @return 单个用户信息
     */
    UserDO getUserDO(Integer id);

    /**
     * 查询多个用户
     *
     * @param queryCondition 查询条件
     * @return 多个用户
     */
    List<UserDO> listUserDO(Map<String, Object> queryCondition);

    /**
     * 查询用户数
     *
     * @param queryCondition 查询条件
     * @return 用户数
     */
    int countUserDO(Map<String, Object> queryCondition);

    /**
     * 插入用户
     *
     * @param userDO 用户表
     * @return UserDO
     */
    UserDO insertUserDO(UserDO userDO);

    /**
     * 删除用户
     *
     * @param deleteCondition 删除条件
     * @return 删除的用户个数
     */
    int deleteUserDO(Map<String, Object> deleteCondition);

    /**
     * 修改用户信息
     *
     * @param userDO 修改用户信息
     * @return userDO
     */
    UserDO updateUserDO(UserDO userDO);

}
