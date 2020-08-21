package com.kylin.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Classname Job
 * @Description TODO
 * @Date 2019-08-21 14:20
 * @Created by zhangbinbin
 */
@Data
public class Job {

    @JSONField(name = "name")
    private String name;


}
