package com.zk.agent.constant;

/**
 *由于会影响系统资源，所以我们需要将文件统一存放到一个隔离的目录进行存储
 */
public interface FileConstant {

    /**
     * 文件保存目录
     */
    String FILE_SAVE_DIR = System.getProperty("user.dir") + "/tmp";
}
