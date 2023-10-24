package com.lsw.service;

import com.lsw.dto.testDTO;
import com.lsw.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestMapper testMapper;

    @Autowired
    public TestService(TestMapper testMapper) {
        this.testMapper = testMapper;
    }
    public testDTO selectDetailInfo() {
        return testMapper.selectDetailInfo();
    }
}
