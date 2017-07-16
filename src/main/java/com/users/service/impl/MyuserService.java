package com.users.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.entity.Myuser;
import com.users.dao.MyuserMapper;
import com.users.service.IMyuserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HenDiao on 2017/7/16.
 */
@Service
public class MyuserService  extends ServiceImpl<MyuserMapper, Myuser> implements IMyuserService {
    @Override
    public List<Myuser> getAllUser(String name) {

        return baseMapper.getUsersNyName(name);
    }
}
