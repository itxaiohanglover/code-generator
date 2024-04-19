package com.artboy.maker.generator.file;

import cn.hutool.core.io.FileUtil;

/**
 * @author artboy
 */
public class StaticFileGenerator {

    /**
     * 复制文件
     *
     * @param inputPath  输入路径
     * @param outputPath 输出路径
     */
    public static void copyFilesByHuTool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }


}
