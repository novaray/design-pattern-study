package io.crscube.skkim._03_abstract_factory._02_after;

import io.crscube.skkim._02_factorymethod._02_after.Ship;
import io.crscube.skkim._02_factorymethod._02_after.ShipFactory;

/**
 * Created by gimseong-gwon on 2022/03/02.
 */
public class ShipInventory {

    public static void main(String[] args) {
        final ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        final Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
