package io.crscube.skkim._03_abstract_factory._03_java;

import io.crscube.skkim._02_factorymethod._02_after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gimseong-gwon on 2022/03/06.
 */
public class FactoryBeanExample {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        // FactoryBeanConfig에서 만들어주는 ShipFactory 그대로 사용하거나 Ship을 가져올 수도 있다.
//        final ShipFactory bean = applicationContext.getBean(ShipFactory.class);
        final Ship bean = applicationContext.getBean(Ship.class);
        System.out.println(bean);
    }
}
