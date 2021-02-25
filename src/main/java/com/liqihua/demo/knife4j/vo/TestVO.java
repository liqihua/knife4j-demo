package com.liqihua.demo.knife4j.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class TestVO {

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty(value = "起始时间")
    private LocalDate startDate;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
}
