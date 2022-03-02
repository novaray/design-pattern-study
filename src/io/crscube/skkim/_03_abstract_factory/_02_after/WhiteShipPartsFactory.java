package io.crscube.skkim._03_abstract_factory._02_after;

import io.crscube.skkim._03_abstract_factory._01_before.WhiteAnchor;
import io.crscube.skkim._03_abstract_factory._01_before.WhiteWheel;

/**
 * Created by gimseong-gwon on 2022/03/02.
 */
public class WhiteShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
