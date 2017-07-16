package com.users.controller;

import com.entity.Myuser;
import com.infrastructure.common.ApiResult;
import com.users.service.IMyuserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by HenDiao on 2017/7/16.
 */
@RestController
public class MyuserController {
    @Autowired
    private IMyuserService myuserService;
    @RequestMapping(value ="/users",method = RequestMethod.GET)
    @ApiOperation(value="getUsers", notes="获取用户",httpMethod = "GET", response = ApiResult.class)
    public ApiResult<List<Myuser>> getUsers(@ApiParam(value="userName",type = "String",required = true) @RequestParam String name){

        ApiResult< List<Myuser> > api=ApiResult.getSuccess();
        List<Myuser> list=myuserService.getAllUser(name);
        api.setData(list);
        return api;
    }
}
