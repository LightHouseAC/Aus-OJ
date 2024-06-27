package com.aus.ausoj.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName problem
 */
@TableName(value ="problem")
@Data
public class Problem implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long problemId;

    /**
     * 题目名
     */
    private String title;

    /**
     * 题目描述
     */
    private String content;

    /**
     * 题解和std
     */
    private String std;

    /**
     * 限制
     */
    private String limit;

    /**
     * 题目标签
     */
    private String tags;

    /**
     * 样例
     */
    private String sampleCase;

    /**
     * 测试数据
     */
    private String judgeCase;

    /**
     * 提交数
     */
    private Long submitCount;

    /**
     * 通过数
     */
    private Long acCount;

    /**
     * 
     */
    private Integer deleted;

    /**
     * 
     */
    private Date createdAt;

    /**
     * 
     */
    private Date updatedAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Problem other = (Problem) that;
        return (this.getProblemId() == null ? other.getProblemId() == null : this.getProblemId().equals(other.getProblemId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getStd() == null ? other.getStd() == null : this.getStd().equals(other.getStd()))
            && (this.getLimit() == null ? other.getLimit() == null : this.getLimit().equals(other.getLimit()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getSampleCase() == null ? other.getSampleCase() == null : this.getSampleCase().equals(other.getSampleCase()))
            && (this.getJudgeCase() == null ? other.getJudgeCase() == null : this.getJudgeCase().equals(other.getJudgeCase()))
            && (this.getSubmitCount() == null ? other.getSubmitCount() == null : this.getSubmitCount().equals(other.getSubmitCount()))
            && (this.getAcCount() == null ? other.getAcCount() == null : this.getAcCount().equals(other.getAcCount()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProblemId() == null) ? 0 : getProblemId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getStd() == null) ? 0 : getStd().hashCode());
        result = prime * result + ((getLimit() == null) ? 0 : getLimit().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getSampleCase() == null) ? 0 : getSampleCase().hashCode());
        result = prime * result + ((getJudgeCase() == null) ? 0 : getJudgeCase().hashCode());
        result = prime * result + ((getSubmitCount() == null) ? 0 : getSubmitCount().hashCode());
        result = prime * result + ((getAcCount() == null) ? 0 : getAcCount().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", problemId=").append(problemId);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", std=").append(std);
        sb.append(", limit=").append(limit);
        sb.append(", tags=").append(tags);
        sb.append(", sampleCase=").append(sampleCase);
        sb.append(", judgeCase=").append(judgeCase);
        sb.append(", submitCount=").append(submitCount);
        sb.append(", acCount=").append(acCount);
        sb.append(", deleted=").append(deleted);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}