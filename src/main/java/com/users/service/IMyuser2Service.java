package com.users.service;

import com.baomidou.mybatisplus.service.IService;
import com.entity.Myuser;
import com.entity.Myuser2;
import com.entity.Myuser2Example;

import java.util.List;

/**
 * Created by HenDiao on 2017/7/16.
 */
public interface IMyuser2Service  {
    List<Myuser2> selectByExample(Myuser2Example example);
 }
