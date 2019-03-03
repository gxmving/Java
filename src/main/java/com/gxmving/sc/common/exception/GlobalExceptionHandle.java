package com.gxmving.sc.common.exception;

import com.gxmving.sc.common.entity.SCResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static com.gxmving.sc.common.constant.StandardConstant.EXCEPTION_CODE;
import static com.gxmving.sc.common.constant.StandardConstant.SCEXCEPTION_CODE;

/**
 * @author gxmving
 * @date 2019-03-03 22:09
 */
@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(SCException.class)
    public SCResult catchSCException(SCException e) {
        return new SCResult(SCEXCEPTION_CODE, e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public SCResult catchException(Exception e) {
        return new SCResult(EXCEPTION_CODE, e.getMessage());
    }
}
