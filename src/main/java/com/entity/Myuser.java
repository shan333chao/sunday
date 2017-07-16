package com.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.infrastructure.common.SuperEntity;

/**
 * Created by HenDiao on 2017/7/16.
 */
@TableName("myuser")
public class Myuser extends SuperEntity<Myuser> {

    @TableField("name")
    private String name;//
    @TableField("pwd")
    private String pwd;//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}