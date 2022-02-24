package io.crscube.skkim.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by gimseong-gwon on 2022/02/24.
 * 리플렉션을 이용하여 싱글톤 부수기
 */
public class MainReflectionSingletonDestroy {
    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings1 = Settings.getInstance();

        final Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        final Settings settings2 = constructor.newInstance();

        System.out.println(settings1 == settings2); //false
    }
}
