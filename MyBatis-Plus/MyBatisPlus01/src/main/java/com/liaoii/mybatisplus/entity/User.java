package com.liaoii.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.liaoii.mybatisplus.enums.SexEnum;
import lombok.*;

@Data
public class User {

    @TableId(value = "uid")
    private Long id;
    @TableField("user_name")
    private String name;
    private Integer age;
    private SexEnum sex;
    private String email;
    @TableLogic
    private Integer isDeleted;
}

