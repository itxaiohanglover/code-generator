package com.artboy.web.service;

import com.artboy.web.model.dto.generator.GeneratorQueryRequest;
import com.artboy.web.model.entity.Generator;
import com.artboy.web.model.vo.GeneratorVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * 代码生成器服务
 *
 * @author artboy
 */
public interface GeneratorService extends IService<Generator> {

    /**
     * 校验
     *
     * @param generator
     * @param add
     */
    void validGenerator(Generator generator, boolean add);

    /**
     * 获取查询条件
     *
     * @param generatorQueryRequest
     * @return
     */
    QueryWrapper<Generator> getQueryWrapper(GeneratorQueryRequest generatorQueryRequest);

    /**
     * 获取代码生成器封装
     *
     * @param generator
     * @param request
     * @return
     */
    GeneratorVO getGeneratorVO(Generator generator, HttpServletRequest request);

    /**
     * 分页获取代码生成器封装
     *
     * @param generatorPage
     * @param request
     * @return
     */
    Page<GeneratorVO> getGeneratorVOPage(Page<Generator> generatorPage, HttpServletRequest request);
}
