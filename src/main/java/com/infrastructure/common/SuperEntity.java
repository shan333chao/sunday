package com.infrastructure.common;

/**
 * Created by HenDiao on 2017/7/16.
 */
import java.io.Serializable;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;

/**
 * 演示实体父类
 */
public class SuperEntity<T extends Model> extends Model<T> {

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
