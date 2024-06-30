package com.ausoj.common.utils;


import com.ausoj.common.common.ErrorCode;
import com.ausoj.common.exception.BusinessException;
import org.springframework.validation.BindingResult;

public class ValidateUtils {

    public static void validateRequest(BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            throw new BusinessException(ErrorCode.PARAMS_ERROR, bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
    }

}
