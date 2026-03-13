package com.zk.agent.tools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * WebScrapingTool测试类
 * 使用Spring Boot的测试注解进行单元测试
 */
@SpringBootTest
public class WebScrapingToolTest {

    /**
     * 测试网页抓取功能的方法
     * 验证WebScrapingTool能否成功抓取指定URL的网页内容
     */
    @Test
    public void testScrapeWebPage() {
        // 创建WebScrapingTool实例
        WebScrapingTool tool = new WebScrapingTool();
        // 设置要抓取的网页URL
        String url = "https://www.codefather.cn";
        // 调用抓取方法获取网页内容
        String result = tool.scrapeWebPage(url);
        // 验证结果不为空，确保抓取成功
        assertNotNull(result);
    }
}
