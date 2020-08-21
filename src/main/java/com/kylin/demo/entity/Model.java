package com.kylin.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * @Classname Model
 * @Description TODO
 * @Date 2019-08-21 21:29
 * @Created by zhangbinbin
 */
@Data
public class Model {

    private String name;

    @JSONField(name = "fact_table")
    private String factTable;

    private List<Table> lookups;


}
