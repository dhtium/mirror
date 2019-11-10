package org.element.mirror.user.dao;

import org.element.mirror.user.entity.User;

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
    User getUser(Integer id);

    /**
     * 查询多个用户
     *
     * @param queryCondition 查询条件
     * @return 多个用户
     */
    List<User> listUser(Map<String, Object> queryCondition);

    /**
     * 查询用户数
     *
     * @param queryCondition 查询条件
     * @return 用户数
     */
    int countUser(Map<String, Object> queryCondition);

    /**
     * 插入用户
     *
     * @param user 用户表
     * @return User
     */
    int insertUser(User user);

    /**
     * 删除用户
     *
     * @param deleteCondition 删除条件
     * @return 删除的用户个数
     */
    int deleteUser(Map<String, Object> deleteCondition);

    /**
     * 修改用户信息
     *
     * @param user 修改用户信息
     * @return user
     */
    int updateUser(User user);

}
