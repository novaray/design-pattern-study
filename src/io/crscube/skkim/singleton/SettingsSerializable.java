package io.crscube.skkim.singleton;

import java.io.Serializable;

/**
 * Created by gimseong-gwon on 2022/02/24.
 * 싱글톤을 부수는 방법 직렬화 역직렬화
 */
public class SettingsSerializable implements Serializable {
    //원래 Serializable Id도 주는 것이 맞지만 편의생 생략..

    private SettingsSerializable() {}

    private static class SettingsHolder {
        private static final SettingsSerializable INSTANCE = new SettingsSerializable();
    }

    public static SettingsSerializable getInstance() {
        return SettingsSerializable.SettingsHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
