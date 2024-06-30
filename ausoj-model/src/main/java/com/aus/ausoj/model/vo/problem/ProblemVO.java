package com.aus.ausoj.model.vo.problem;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import com.aus.ausoj.model.entity.Problem;
import com.aus.ausoj.model.json.Limit;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ProblemVO implements Serializable {

    private static final long serialVersionUID = 1403515480504215959L;

    /**
     * 题目名
     */
    private String title;

    /**
     * 题目描述
     */
    private String content;

    /**
     * 限制
     */
    private Limit limit;

    /**
     * 题目标签
     */
    private List<String> tags;

    /**
     * 样例
     */
    private String sampleCase;

    /**
     * 提交数
     */
    private Long submitCount;

    /**
     * 通过数
     */
    private Long acCount;

    public static Problem voToObj(ProblemVO problemVO){
        if (problemVO == null) return null;
        Problem problem = new Problem();
        BeanUtil.copyProperties(problemVO, problem);
        List<String> tagList = problemVO.getTags();
        if (tagList != null){
            problem.setTags(JSONUtil.toJsonStr(tagList));
        }
        Limit voLimit = problemVO.getLimit();
        if (voLimit != null){
            problem.setLimit(JSONUtil.toJsonStr(voLimit));
        }
        return problem;
    }

    public static ProblemVO objToVo(Problem problem){
        if (problem == null) return null;
        ProblemVO problemVO = new ProblemVO();
        BeanUtil.copyProperties(problem, problemVO);
        problemVO.setTags(JSONUtil.toList(problem.getTags(), String.class));
        problemVO.setLimit(JSONUtil.toBean(problem.getLimit(), Limit.class));
        return problemVO;
    }

}
