package io.crscube.skkim._03_abstract_factory._01_before;

import io.crscube.skkim._02_factorymethod._02_after.DefaultShipFactory;
import io.crscube.skkim._02_factorymethod._02_after.Ship;
import io.crscube.skkim._02_factorymethod._02_after.WhiteShip;

/**
 * Created by gimseong-gwon on 2022/03/02.
 */
public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());

        return ship;
    }
}
