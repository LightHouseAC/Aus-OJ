package com.aus.ausoj.model.enums;

import cn.hutool.core.util.ObjectUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum SubmissionStatusEnum {

    WAITING("等待中", 0),
    RUNNING("判题中", 1),
    DONE("判题完成", 2);

    private final String text;

    private final Integer value;

    SubmissionStatusEnum(String text, Integer value){
        this.text = text;
        this.value = value;
    }

    public static List<Integer> getValues(){
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public static SubmissionStatusEnum getEnumByValue(Integer value){
        if (ObjectUtil.isEmpty(value)) return null;
        for (SubmissionStatusEnum roleEnum : SubmissionStatusEnum.values()){
            if (roleEnum.value.equals(value))
                return roleEnum;
        }
        return null;
    }

    public Integer getValue(){
        return value;
    }

    public String getText(){
        return text;
    }

}
