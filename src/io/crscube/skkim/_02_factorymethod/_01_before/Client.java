package io.crscube.skkim._02_factorymethod._01_before;

/**
 * Created by gimseong-gwon on 2022/02/27.
 */
public class Client {
    public static void main(String[] args) {
        final Client client = new Client();

        final Ship whiteShip = ShipFactory.orderShip("whiteShip", "novaray@naver.com");
        System.out.println(whiteShip);

        final Ship blackShip = ShipFactory.orderShip("blackShip", "novaray@naver.com");
        System.out.println(blackShip);
    }
}
