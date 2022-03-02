package io.crscube.skkim._03_abstract_factory._02_after;

import io.crscube.skkim._02_factorymethod._02_after.DefaultShipFactory;
import io.crscube.skkim._02_factorymethod._02_after.Ship;
import io.crscube.skkim._02_factorymethod._02_after.WhiteShip;

/**
 * Created by gimseong-gwon on 2022/03/02.
 */
public class WhiteShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());

        return ship;
    }
}
