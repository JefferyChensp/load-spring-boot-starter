package com.csp.starter.autoconfigure;

import com.csp.starter.properties.LoadProperties;
import com.csp.starter.service.LoadService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author csp
 * @date 2022/7/30
 */
@Configuration
@EnableConfigurationProperties(LoadProperties.class)
public class LoadServiceAutoConfiguration {

    private final LoadProperties loadProperties;

    public LoadServiceAutoConfiguration(LoadProperties loadProperties) {
        this.loadProperties = loadProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public LoadService loadService() {
        return new LoadService(loadProperties.getProtocol(), loadProperties.getContent());
    }

}
