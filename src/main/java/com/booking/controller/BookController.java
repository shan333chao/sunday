package com.booking.controller;

import com.infrastructure.common.ApiResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HenDiao on 2017/7/8.
 */
@RestController
public class BookController {
    @RequestMapping("/")

    @ApiOperation(value="测试api", notes="我的API测试方法",httpMethod = "GET", response = ApiResult.class)
    public ApiResult<String> getOk(){
        ApiResult<String> api=ApiResult.getSuccess();
        api.setData("666");
        return api;
    }
}
