package com.mgx.service.impl;

import com.mgx.dao.UserMapper;
import com.mgx.pojo.User;
import com.mgx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mgx on 17/8/29.
 */

@Service("userService")
public class UserServiceImpl implements IUserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
