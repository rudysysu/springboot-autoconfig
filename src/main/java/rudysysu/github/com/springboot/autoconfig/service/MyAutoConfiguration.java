package rudysysu.github.com.springboot.autoconfig.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该路径可以被直接扫描到，无需在spring.factories中额外指定
 * 属性满足条件就自动装配
 */
@Configuration
public class MyAutoConfiguration {
    @Bean
    @ConditionalOnProperty(name = "enabled", havingValue = "true")
    public Integer myInteger() {
        System.out.println("myInteger");
        return 1;
    }
}
