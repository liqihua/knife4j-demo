package com.liqihua.demo.knife4j.controller;

import com.liqihua.demo.knife4j.dto.TestDTO;
import com.liqihua.demo.knife4j.vo.TestVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Api(tags = "测试controller")
@RestController
@RequestMapping("/test")
public class TestController {


    @ApiOperation(value = "一个查询接口")
    @PostMapping("/test1")
    public TestVO test1(@RequestBody TestDTO param) {
        TestVO vo = new TestVO();
        vo.setAge(35);
        vo.setName("tony");
        vo.setCreateTime(LocalDateTime.now());
        vo.setStartDate(LocalDate.now());
        return vo;
    }

}
