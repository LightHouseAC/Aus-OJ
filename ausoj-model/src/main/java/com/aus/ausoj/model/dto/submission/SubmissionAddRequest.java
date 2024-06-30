package com.aus.ausoj.model.dto.submission;

import lombok.Data;

import java.io.Serializable;

@Data
public class SubmissionAddRequest implements Serializable {

    private static final long serialVersionUID = 6555189646393098663L;

    /**
     * 题号
     */
    private Long problemId;

    /**
     * 代码语言
     */
    private String language;

    /**
     * 代码
     */
    private String code;

}
