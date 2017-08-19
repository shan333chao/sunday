package com.users.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.entity.Myuser;
import com.entity.Myuser2;
import com.entity.Myuser2Example;
import com.users.dao.Myuser2Mapper;
import com.users.dao.MyuserMapper;
import com.users.service.IMyuser2Service;
import com.users.service.IMyuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by HenDiao on 2017/7/16.
 */
@Service
public class Myuser2Service  implements IMyuser2Service {

    @Autowired
    private  Myuser2Mapper myuser2Mapper;
    @Override
    public List<Myuser2> selectByExample(Myuser2Example example) {
        return myuser2Mapper.selectByExample(example);
    }
}
