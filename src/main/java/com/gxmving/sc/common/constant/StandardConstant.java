package com.gxmving.sc.common.constant;

import com.gxmving.sc.common.entity.SCResult;

/**
 * @author gxmving
 * @date 2019-03-03 21:58
 */
public class StandardConstant {

    public final static Integer SCEXCEPTION_CODE = 888;

    public final static Integer EXCEPTION_CODE = 999;

    public final static SCResult SUCCEED_RESULT;

    static {
        SUCCEED_RESULT = new SCResult();
        SUCCEED_RESULT.setCode(0);
        SUCCEED_RESULT.setData(null);
        SUCCEED_RESULT.setMsg("SUCCEED");
    }
}
