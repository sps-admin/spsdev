package com.skyguard.sps.server.test;

import com.skyguard.sps.common.test.TestDto;
import org.springframework.stereotype.Service;

/**
 * Created by liupei on 2018/5/18.
 */
@Service
public class TestServiceImpl implements TestService{

    public String test(TestDto testDto) {
        return testDto.toString();
    }
}
