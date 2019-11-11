package org.element.mirror.user.service.impl;

import org.element.mirror.user.dao.UserDao;
import org.element.mirror.user.entity.User;
import org.element.mirror.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author dhtium
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    @Override
    public List<User> listUser(Map<String, Object> queryCondition) {
        return userDao.listUser(queryCondition);
    }

    @Override
    public int countUser(Map<String, Object> queryCondition) {
        return userDao.countUser(queryCondition);
    }

    @Override
    public int saveUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public int removeUser(Map<String, Object> deleteCondition) {
        return userDao.deleteUser(deleteCondition);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

}
