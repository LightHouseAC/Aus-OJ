package com.ausoj.common.utils;

import java.util.regex.Pattern;

/**
 * 校验器工具类
 */
public class Validator {

    public static final String REGEX_USERNAME = "^[a-zA-Z0-9]{3,16}$";

    public static final String REGEX_PASSWORD = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";

    public static boolean isUserName(String userName){
        return Pattern.matches(REGEX_USERNAME, userName);
    }

    public static boolean isPassWord(String userPasswd){
        return Pattern.matches(REGEX_PASSWORD, userPasswd);
    }

}
