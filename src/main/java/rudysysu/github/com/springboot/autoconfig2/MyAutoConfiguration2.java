package rudysysu.github.com.springboot.autoconfig2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该路径无法被直接扫描到，需要在spring.factories中额外指定
 * 属性满足条件就自动装配
 */
@Configuration
public class MyAutoConfiguration2 {
    @Bean
    @ConditionalOnProperty(name = "enabled", havingValue = "true")
    public Integer myInteger2() {
        System.out.println("myInteger2");
        return 1;
    }
}
