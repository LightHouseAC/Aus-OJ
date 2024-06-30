package com.ausoj.common.utils;

import org.apache.commons.lang3.StringUtils;

public class SQLUtils {

    public static boolean validateSortField(String sortField){
        if (StringUtils.isBlank(sortField)) return false;
        return !StringUtils.containsAny(sortField, "=", "(", ")", " ");
    }

}