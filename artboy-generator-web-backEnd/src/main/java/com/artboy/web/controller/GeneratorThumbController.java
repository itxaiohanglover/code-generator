package com.artboy.web.controller;

import com.artboy.web.common.BaseResponse;
import com.artboy.web.common.ErrorCode;
import com.artboy.web.common.ResultUtils;
import com.artboy.web.exception.BusinessException;
import com.artboy.web.model.dto.generatorthumb.GeneratorThumbAddRequest;
import com.artboy.web.model.entity.User;
import com.artboy.web.service.GeneratorThumbService;
import com.artboy.web.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 代码生成器点赞接口
 *
 * @author artboy
 */
@RestController
@RequestMapping("/generator_thumb")
@Slf4j
public class GeneratorThumbController {

    @Resource
    private GeneratorThumbService generatorThumbService;

    @Resource
    private UserService userService;

    /**
     * 点赞 / 取消点赞
     *
     * @param generatorThumbAddRequest
     * @param request
     * @return resultNum 本次点赞变化数
     */
    @PostMapping("/")
    public BaseResponse<Integer> doThumb(@RequestBody GeneratorThumbAddRequest generatorThumbAddRequest,
            HttpServletRequest request) {
        if (generatorThumbAddRequest == null || generatorThumbAddRequest.getGeneratorId() <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 登录才能点赞
        final User loginUser = userService.getLoginUser(request);
        long generatorId = generatorThumbAddRequest.getGeneratorId();
        int result = generatorThumbService.doGeneratorThumb(generatorId, loginUser);
        return ResultUtils.success(result);
    }

}
