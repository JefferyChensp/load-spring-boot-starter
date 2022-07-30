package com.csp.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author csp
 * @date 2022/7/30
 */
@ConfigurationProperties(prefix = "service.load")
public class LoadProperties {
    /**
     * 协议
     */
    private String protocol;
    /**
     * 内容
     */
    private String content;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
