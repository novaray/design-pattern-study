package io.crscube.skkim._03_abstract_factory._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gimseong-gwon on 2022/03/06.
 */
@Configuration
public class FactoryBeanConfig {

    @Bean
    public ShipFactory ShipFactory() {
        return new ShipFactory();
    }
}
