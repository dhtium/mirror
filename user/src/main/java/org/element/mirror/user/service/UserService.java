package org.element.mirror.user.service;

import org.element.mirror.user.entity.User;

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
     * @return user
     */
    User getUser(Integer id);

    /**
     * 返回多个业务bean
     *
     * @param queryCondition 查询条件
     * @return list<User>
     */
    List<User> listUser(Map<String, Object> queryCondition);

    /**
     * 返回查询的用户数
     *
     * @param queryCondition 查询条件
     * @return 返回用户数
     */
    int countUser(Map<String, Object> queryCondition);

    /**
     * 保存用户
     *
     * @param user 业务bean
     * @return 返回插入后的用户
     */
    int saveUser(User user);

    /**
     * 删除用户
     *
     * @param deleteCondition 删除条件
     * @return 返回删除的用户数
     */
    int removeUser(Map<String, Object> deleteCondition);

    /**
     * 修改用户信息
     *
     * @param user 业务bean
     * @return 修改后的用户数
     */
    int updateUser(User user);


}
