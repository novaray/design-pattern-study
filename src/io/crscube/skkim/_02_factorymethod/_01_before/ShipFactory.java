package io.crscube.skkim._02_factorymethod._01_before;

/**
 * Created by gimseong-gwon on 2022/02/27.
 */
public class ShipFactory {

    public static Ship orderShip(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일을 입력해주세요.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("whiteShip")) {
            ship.setLogo("1");
        } else if (name.equalsIgnoreCase("blackShip")) {
            ship.setLogo("2");
        }

        if (name.equalsIgnoreCase("whiteShip")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackShip")) {
            ship.setColor("black");
        }

        finishFor(name);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void finishFor(String name) {
        System.out.println(name + " 다 만들었습니다.");
    }
}
