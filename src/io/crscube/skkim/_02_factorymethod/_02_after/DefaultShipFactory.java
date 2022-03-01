package io.crscube.skkim._02_factorymethod._02_after;

/**
 * Created by gimseong-gwon on 2022/03/01.
 */
public abstract class DefaultShipFactory implements ShipFactory {
    //createShip 메서드는 구현하지 않는다.

    @Override
    public void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일을 입력해주세요.");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
