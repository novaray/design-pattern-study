package io.crscube.skkim._02_factorymethod._02_after;

/**
 * Created by gimseong-gwon on 2022/02/27.
 */
public class BlackShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
