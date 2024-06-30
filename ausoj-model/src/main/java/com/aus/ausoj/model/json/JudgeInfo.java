package com.aus.ausoj.model.json;

import lombok.Data;

@Data
public class JudgeInfo {

    /**
     * 程序运行信息
     */
    private String msg;

    /**
     * 运行时间
     */
    private Long runTime;

    /**
     * 内存使用
     */
    private Long memUsed;

    /**
     * 报错信息
     */
    private String err;

}
