package com.aus.ausoj.model.vo.codesandbox;

import com.aus.ausoj.model.json.JudgeInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RunCodeResponse implements Serializable {

    private static final long serialVersionUID = 4289580638267488646L;

    private List<String> outputList;

    private String msg;

    private String status;

    private JudgeInfo judgeInfo;

}
