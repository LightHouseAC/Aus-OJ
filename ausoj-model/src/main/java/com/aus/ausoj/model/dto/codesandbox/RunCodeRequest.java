package com.aus.ausoj.model.dto.codesandbox;

import com.aus.ausoj.model.json.Limit;
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
public class RunCodeRequest implements Serializable {

    private static final long serialVersionUID = 6838599925025729051L;

    private List<String> inputList;

    private String code;

    private String language;

    private Limit limit;

}
