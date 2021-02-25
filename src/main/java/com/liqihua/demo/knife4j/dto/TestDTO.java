package com.liqihua.demo.knife4j.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TestDTO {

    @ApiModelProperty(value = "账号",required = true)
    private String account;

    @ApiModelProperty(value = "起始时间")
    private LocalDate startDate;
}
