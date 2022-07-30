package com.csp.starter.service;

/**
 * @author csp
 * @date 2022/7/30
 */
public class LoadService {
    /**
     * 协议
     */
    private String protocol;
    /**
     * 内容
     */
    private String content;

    public LoadService(String protocol, String content) {
        this.protocol = protocol;
        this.content = content;
    }

    public String load(String request) {
        return protocol + request + content;
    }

}
