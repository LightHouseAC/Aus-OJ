package com.aus.ausoj.model.dto.problem;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class AskForStdRequest implements Serializable {

    private static final long serialVersionUID = 2424122350683877344L;

    @NotNull
    @Min(1)
    private Long uid;

    @NotNull
    @Min(1)
    private Long problemId;

}