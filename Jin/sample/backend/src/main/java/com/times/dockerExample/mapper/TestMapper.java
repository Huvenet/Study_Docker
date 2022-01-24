package com.times.dockerExample.mapper;

import com.times.dockerExample.model.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    Test findById(Long id);
}
