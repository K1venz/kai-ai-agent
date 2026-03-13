package com.zk.agent.tools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * PDF生成工具的测试类
 * 使用Spring Boot的测试框架进行单元测试
 */
@SpringBootTest
public class PDFGenerationToolTest {

    /**
     * 测试PDF生成方法
     * 验证PDF生成工具是否能够正常生成PDF文件
     */
    @Test
    public void testGeneratePDF() {
        // 创建PDF生成工具实例
        PDFGenerationTool tool = new PDFGenerationTool();
        // 设置要生成的PDF文件名
        String fileName = "编程导航原创项目.pdf";
        // 设置要写入PDF的内容
        String content = "编程导航原创项目 https://www.codefather.cn";
        // 调用生成PDF方法并获取结果
        String result = tool.generatePDF(fileName, content);
        // 验证结果不为空，即PDF生成成功
        assertNotNull(result);
    }
}
