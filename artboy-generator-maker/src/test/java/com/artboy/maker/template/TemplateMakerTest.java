package com.artboy.maker.template;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;
import com.artboy.maker.meta.Meta;
import com.artboy.maker.template.enums.FileFilerRuleEnum;
import com.artboy.maker.template.enums.FileFilterRangeEnum;
import com.artboy.maker.template.model.FileFilterConfig;
import com.artboy.maker.template.model.TemplateMakerConfig;
import com.artboy.maker.template.model.TemplateMakerFileConfig;
import com.artboy.maker.template.model.TemplateMakerModelConfig;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static com.artboy.demo.TemplateMakerExample.makeTemplate;


public class TemplateMakerTest {

    @Test
    public void makeTemplate1() {
        // 指定模板文件Json配置的根目录
        String rootPath = "examples/springboot-init-plus/";
        // 分步次数
        int step = 8;
        makeTemplate(rootPath, step);
    }

    @Test
    public void makeTemplate4() {
        // 指定模板文件Json配置的根目录
        String rootPath = "examples/my-card/";
        // 分步次数
        int step = 1;
        makeTemplate(rootPath, step);
    }

    @Test
    public void makeTemplate7() {
        // 指定模板文件Json配置的根目录
        String rootPath = "examples/bigdata-show/";
        // 分步次数
        int step = 1;
        makeTemplate(rootPath, step);
    }

}
