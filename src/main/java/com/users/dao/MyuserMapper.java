package com.users.dao;

import com.entity.Myuser;
import com.infrastructure.common.SuperMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by HenDiao on 2017/7/16.
 */

public interface MyuserMapper extends SuperMapper<Myuser> {


    @Select("select * from myuser where name=#{name}")
    List<Myuser> getUsersNyName(@Param("name") String name);

}
