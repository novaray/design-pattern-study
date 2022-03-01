package io.crscube.skkim._02_factorymethod._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gimseong-gwon on 2022/03/01.
 */
@Configuration
public class Config {

    @Bean
    public String hello() {
        return "hello";
    }
}
