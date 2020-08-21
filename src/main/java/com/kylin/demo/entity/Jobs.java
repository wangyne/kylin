package com.kylin.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * @Classname Jobs
 * @Description TODO
 * @Date 2019-08-21 14:24
 * @Created by zhangbinbin
 */
@Data
public class Jobs {
    private String submitter;

    @JSONField(name = "job_status")
    private String jobStatus;

    @JSONField(name = "related_cube")
    private String relateCube;

    @JSONField(name = "steps")
    private List<Job> steps;


}
