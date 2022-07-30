package com.csp.starter.annotation;

import com.csp.starter.autoconfigure.LoadServiceAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @desc 手动开启加载自动配置
 * @author csp
 * @date 2022/7/30
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(LoadServiceAutoConfiguration.class)
public @interface EnableLoadAutoConfiguration {
}
