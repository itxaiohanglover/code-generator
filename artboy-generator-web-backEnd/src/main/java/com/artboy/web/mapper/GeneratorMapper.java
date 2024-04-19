package com.artboy.web.mapper;

import com.artboy.web.model.entity.Generator;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
 * 代码生成器数据库操作
 *
 * @author artboy
 */
public interface GeneratorMapper extends BaseMapper<Generator> {

    /**
     * 查询代码生成器列表（包括已被删除的数据）
     */
    List<Generator> listGeneratorWithDelete(Date minUpdateTime);


    @Select("SELECT id, distPath FROM generator WHERE isDelete = 1")
    List<Generator> listDeletedGenerator();

}




