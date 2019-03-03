package com.gxmving.sc.springboot.api;

import com.gxmving.sc.common.entity.SCResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.gxmving.sc.common.constant.StandardConstant.SUCCEED_RESULT;

/**
 * @author gxmving
 * @date 2019-03-03 21:47
 */
@RestController
public class TestController {

    @PostMapping("/test")
    public SCResult test() throws Exception {
        return SUCCEED_RESULT;
    }
}
