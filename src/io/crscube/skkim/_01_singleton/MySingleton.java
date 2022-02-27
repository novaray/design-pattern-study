package io.crscube.skkim._01_singleton;

/**
 * Created by skkim on 2022/02/26.
 *
 * @author Kim Sung Kwon
 */
public class MySingleton {
    private MySingleton() {}

    private static class MySingletonHolder {
        private static final MySingleton INSTANCE = new MySingleton();
    }

    public MySingleton getInstance() {
        return MySingletonHolder.INSTANCE;
    }
}
