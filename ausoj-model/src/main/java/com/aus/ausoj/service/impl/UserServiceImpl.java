package com.aus.ausoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aus.ausoj.model.entity.User;
import com.aus.ausoj.service.UserService;
import com.aus.ausoj.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author recww
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-06-27 23:41:08
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




