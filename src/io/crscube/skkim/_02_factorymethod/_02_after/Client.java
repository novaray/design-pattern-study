package io.crscube.skkim._02_factorymethod._02_after;

/**
 * Created by gimseong-gwon on 2022/02/27.
 */
public class Client {
    public static void main(String[] args) {
        final Client client = new Client();

        final Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "novaray@naver.com");
        System.out.println(whiteShip);

        final Ship blackShip = new BlackShipFactory().orderShip("blackShip", "novaray@naver.com");
        System.out.println(blackShip);
    }
}
