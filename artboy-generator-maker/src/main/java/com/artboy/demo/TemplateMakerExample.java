package com.artboy.demo;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;
import com.artboy.maker.template.TemplateMaker;
import com.artboy.maker.template.model.TemplateMakerConfig;

/**
 * @author 文艺倾年
 */
public class TemplateMakerExample {

    /**
     * 测试使用
     */
    public static void main(String[] args) {
        // 指定模板文件Json配置的根目录
        String rootPath = "examples/bigdata-show/";
        // 分步次数
        int step = 1;
        makeTemplate(rootPath, step);
    }

    public static void makeTemplate(String rootPath, int step) {
        // 默认模板ID为0
        long id = 0L;
        TemplateMakerConfig templateMakerConfig;
        // 开始分步制作，默认0为根配置文件
        for(int i = 0; i <= step; ++ i) {
            String jsonPath = rootPath + String.format("TemplateMaker%d.json", i);
            String configJsonStr = ResourceUtil.readUtf8Str(jsonPath);
            templateMakerConfig = JSONUtil.toBean(configJsonStr,
                    TemplateMakerConfig.class);
            id = TemplateMaker.makeTemplate(templateMakerConfig);
        }
        System.out.println("制作完成，模板ID为：" + id);
    }
}
