package com.aus.ausoj.model.enums;

import cn.hutool.core.util.ObjectUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum SubmissionResultEnum {

    AC("通过", "Accepted"),
    WA("答案错误", "Wrong Answer"),
    TLE("运行超时", "Time Limit Exceeded"),
    MLE("内存超限", "Memory Limit Exceeded"),
    RE("运行错误", "Runtime Error");

    private final String text;

    private final String value;

    SubmissionResultEnum(String text, String value){
        this.text = text;
        this.value = value;
    }

    public static List<String> getValues(){
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public static SubmissionResultEnum getEnumByValue(String value){
        if (ObjectUtil.isEmpty(value)) return null;
        for (SubmissionResultEnum roleEnum : SubmissionResultEnum.values()){
            if (roleEnum.value.equals(value))
                return roleEnum;
        }
        return null;
    }

    public String getValue(){
        return value;
    }

    public String getText(){
        return text;
    }

}
