package io.crscube.skkim._03_abstract_factory._03_java;

import io.crscube.skkim._02_factorymethod._02_after.Ship;
import io.crscube.skkim._02_factorymethod._02_after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by gimseong-gwon on 2022/03/06.
 */
public class ShipFactory implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteShip");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
