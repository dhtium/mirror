package org.element.mirror.user.service.impl;

import org.element.mirror.user.dao.UserDao;
import org.element.mirror.user.entity.UserDO;
import org.element.mirror.user.entity.UserDTO;
import org.element.mirror.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author dhtium
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDTO getUserDTO(Integer id) {
        System.out.println("查询单个用户");
        UserDO userDO = userDao.getUserDO(id);
        // convert userDO to userDTO
        return null;
    }

    @Override
    public List<UserDTO> listUserDTO(Map<String, Object> queryCondition) {
        return null;
    }

    @Override
    public Integer countUserDTO(Map<String, Object> queryCondition) {
        return null;
    }

    @Override
    public UserDTO saveUserDTO(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO removeUserDTO(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUserDTO(UserDTO userDTO) {
        return null;
    }
}
