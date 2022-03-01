package io.crscube.skkim._02_factorymethod._02_after;

/**
 * Created by gimseong-gwon on 2022/02/27.
 */
public class Client {
    public static void main(String[] args) {
        final Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "skkim@skkim.com");
        client.print(new BlackShipFactory(), "blackShip", "skkim@skkim.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
