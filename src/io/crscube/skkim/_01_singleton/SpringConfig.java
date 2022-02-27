package io.crscube.skkim._01_singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by skkim on 2022/02/26.
 *
 * @author Kim Sung Kwon
 */
@Configuration
public class SpringConfig {
    @Bean
    public String hello() {
        return "hello";
    }
}
