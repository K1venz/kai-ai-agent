package com.zk.agent.demo.invoke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;

public class LangchainAiInvoke {
    public static void main(String[] args) {
        QwenChatModel qwenChatModel = QwenChatModel.builder()
                .apiKey(TestApiKey.API_KEY)
                .modelName("qwen-max")
                .build();
        String answer = qwenChatModel.chat("我是新学ai的小白，教教我怎么快速入门");
        System.out.println(answer);
    }
}
