package com.users.dao;

import com.entity.Myuser2;
import com.entity.Myuser2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Myuser2Mapper   {
    long countByExample(Myuser2Example example);

    int deleteByExample(Myuser2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Myuser2 record);

    int insertSelective(Myuser2 record);

    List<Myuser2> selectByExample(Myuser2Example example);

    Myuser2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Myuser2 record, @Param("example") Myuser2Example example);

    int updateByExample(@Param("record") Myuser2 record, @Param("example") Myuser2Example example);

    int updateByPrimaryKeySelective(Myuser2 record);

    int updateByPrimaryKey(Myuser2 record);
}