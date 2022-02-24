package io.crscube.skkim.singleton;

/**
 * Created by gimseong-gwon on 2022/02/23.
 */

// 4. static inner class 사용하기(권장하는 방식.)
public class Settings {
    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}

// ----------

// 1. syncronized 키워드 사용하기
class Settings_N1 {
    private static Settings_N1 instance;

    private Settings_N1() {}

    public static synchronized Settings_N1 getInstance() {
        if (instance == null) {
            instance = new Settings_N1();
        }

        return instance;
    }
}

// 2. 이른 초기화(eager initialization) 사용하기
class Settings_N2 {
    private static final Settings_N2 INSTANCE = new Settings_N2();

    private Settings_N2() {}

    public static Settings_N2 getInstance() {
        return INSTANCE;
    }
}

// 3. double checked locking 사용하기
class Settings_N3 {
    private static volatile Settings_N3 instance;

    private Settings_N3() {}

    public static Settings_N3 getInstance() {
        if (instance == null) {
            synchronized (Settings_N3.class) {
                if (instance == null) {
                    instance = new Settings_N3();
                }
            }
        }

        return instance;
    }
}
