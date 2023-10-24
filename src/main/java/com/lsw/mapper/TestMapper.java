package com.lsw.mapper;

import com.lsw.dto.testDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestMapper {
    testDTO selectDetailInfo();
}
