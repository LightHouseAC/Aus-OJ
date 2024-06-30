package com.ausoj.common.exception;


import com.ausoj.common.common.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{

    private static final long serialVersionUID = 5562576700744708116L;

    private final int code;

    public BusinessException(int code, String message){
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message){
        super(message);
        this.code = errorCode.getCode();
    }

}
