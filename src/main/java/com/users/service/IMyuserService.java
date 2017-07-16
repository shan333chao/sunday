package com.users.service;

import com.baomidou.mybatisplus.service.IService;
import com.entity.Myuser;

import java.util.List;

/**
 * Created by HenDiao on 2017/7/16.
 */
public interface IMyuserService extends IService<Myuser> {
    List<Myuser> getAllUser(String name);
 }
