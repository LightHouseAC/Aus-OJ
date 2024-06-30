package com.aus.ausoj.model.vo.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVO implements Serializable {

    private static final long serialVersionUID = 7457896978591637194L;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String userRole;

    /**
     *
     */
    private Long submitCount;

    /**
     *
     */
    private Long acCount;

}
