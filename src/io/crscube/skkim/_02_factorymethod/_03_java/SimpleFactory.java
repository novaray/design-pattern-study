package io.crscube.skkim._02_factorymethod._03_java;

import io.crscube.skkim._02_factorymethod._02_after.BlackShip;
import io.crscube.skkim._02_factorymethod._02_after.WhiteShip;

/**
 * Created by gimseong-gwon on 2022/03/01.
 */
public class SimpleFactory {

    public Object createProduct(String name) {
        if ("whiteShip".equals(name)) {
            return new WhiteShip();
        } else if ("blackShip".equals(name)) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
