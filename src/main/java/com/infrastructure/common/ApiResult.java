package com.infrastructure.common;

import java.util.HashMap;

/**
 * Created by HenDiao on 2017/7/16.
 */
public class ApiResult<T> {
    private  int resCode=-1;
    private  String msg;
    private  T data;
    private HashMap<String,String> ext;

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public HashMap<String, String> getExt() {
        return ext;
    }

    public void setExt(HashMap<String, String> ext) {
        this.ext = ext;
    }

    public  static ApiResult getSuccess(){
        ApiResult res=new ApiResult();
        res.setResCode(1);
        res.setMsg("成功");
        return res;
    }
}
