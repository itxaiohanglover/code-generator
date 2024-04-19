package com.artboy.maker;


import com.artboy.maker.generator.ZipGenerator;
import com.artboy.maker.generator.main.GenerateTemplate;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * @author artboy
 */
public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        GenerateTemplate generator = new ZipGenerator();
        generator.doGenerate();
    }
}
