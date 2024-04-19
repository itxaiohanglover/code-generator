package com.artboy.web.service;

import com.artboy.web.model.entity.Generator;
import com.artboy.web.model.entity.GeneratorFavour;
import com.artboy.web.model.entity.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 代码生成器收藏服务
 *
 * @author artboy
 */
public interface GeneratorFavourService extends IService<GeneratorFavour> {

    /**
     * 代码生成器收藏
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doGeneratorFavour(long postId, User loginUser);

    /**
     * 分页获取用户收藏的代码生成器列表
     *
     * @param page
     * @param queryWrapper
     * @param favourUserId
     * @return
     */
    Page<Generator> listFavourGeneratorByPage(IPage<Generator> page, Wrapper<Generator> queryWrapper,
                                              long favourUserId);

    /**
     * 代码生成器收藏（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doGeneratorFavourInner(long userId, long postId);
}
