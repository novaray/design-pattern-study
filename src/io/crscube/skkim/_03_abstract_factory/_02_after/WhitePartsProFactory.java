package io.crscube.skkim._03_abstract_factory._02_after;

/**
 * Created by gimseong-gwon on 2022/03/02.
 */
public class WhitePartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
