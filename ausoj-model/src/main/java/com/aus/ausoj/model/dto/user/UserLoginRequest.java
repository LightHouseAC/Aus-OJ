package com.aus.ausoj.model.dto.user;

import lombok.Data;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 275482280271005741L;

    @Size(min = 3, max = 16)
    private String username;

    @Size(min = 4, max = 32)
    private String password;

}
