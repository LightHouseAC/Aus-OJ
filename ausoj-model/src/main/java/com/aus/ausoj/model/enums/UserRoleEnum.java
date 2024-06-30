package com.aus.ausoj.model.enums;

import cn.hutool.core.util.ObjectUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum UserRoleEnum {

    USER("用户", "user"),
    ADMIN("管理员", "admin"),
    BANNED("封号", "banned");

    private final String text;

    private final String value;

    UserRoleEnum(String text, String value){
        this.text = text;
        this.value = value;
    }

    public static List<String> getValues(){
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public static UserRoleEnum getEnumByValue(String value){
        if (ObjectUtil.isEmpty(value)) return null;
        for (UserRoleEnum roleEnum : UserRoleEnum.values()){
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
