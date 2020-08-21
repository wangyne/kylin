package com.kylin.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

/**
 * @Classname Cube
 * @Description TODO
 * @Date 2019-08-21 21:29
 * @Created by zhangbinbin
 */
@Data
public class Cube {

    private String name;

    private String model;

    private String status;

    private Model modelBo;


}
