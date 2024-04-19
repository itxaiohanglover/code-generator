package com.artboy.web.model.dto.generatorthumb;

import lombok.Data;

import java.io.Serializable;

/**
 * 生成器点赞请求
 *
 * @author artboy
 */
@Data
public class GeneratorThumbAddRequest implements Serializable {

    /**
     * 生成器 id
     */
    private Long generatorId;

    private static final long serialVersionUID = 1L;
}
