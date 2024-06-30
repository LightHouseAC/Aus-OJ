package com.aus.ausoj.model.dto.problem;

import com.aus.ausoj.model.json.JudgeCase;
import com.aus.ausoj.model.json.Limit;
import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.List;

@Data
public class ProblemUpdateRequest implements Serializable {

    private static final long serialVersionUID = 7411540738810971785L;

    @NotNull
    @Min(1)
    private Long problemId;

    @NotBlank
    @Size(min = 1, max = 64)
    private String title;

    @NotBlank
    @Size(min = 1, max = 5000)
    private String content;

    private List<String> tags;

    @Size(max = 5000)
    private String std;

    private JudgeCase sampleCase;

    @NotEmpty
    private List<JudgeCase> judgeCase;

    @NotNull
    private Limit limit;

}