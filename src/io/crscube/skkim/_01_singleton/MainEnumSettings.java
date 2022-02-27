package io.crscube.skkim._01_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by skkim on 2022/02/26.
 *
 * @author Kim Sung Kwon
 * java에서 enum을 리플렉션으로 생성할 수 있는 코드가 없다.
 * @see java.lang.reflect.Constructor#newInstance
 */
public class MainEnumSettings {
    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EnumSettings settings = EnumSettings.INSTANCE;

        // enum의 바이트코드를 보면 생성자가 문자열을 받게 되어있는데 그 문자열은 enum의 이름이다.
        EnumSettings settings1 = null;
        final Constructor<?>[] declaredConstructors = EnumSettings.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            settings1 = (EnumSettings) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings == settings1);  //에러 발생(Cannot reflectively create enum objects)
    }
}
