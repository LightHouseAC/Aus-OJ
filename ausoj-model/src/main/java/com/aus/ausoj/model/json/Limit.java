package com.aus.ausoj.model.json;

import lombok.Data;

@Data
public class Limit {

    /**
     * 时间限制，单位ms
     */
    private Long timeLimit;

    /**
     * 内存限制，单位KB
     */
    private Long memLimit;

    /**
     * 堆栈限制，单位KB
     */
    private Long stackLimit;


}
