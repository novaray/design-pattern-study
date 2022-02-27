package io.crscube.skkim._01_singleton;

/**
 * Created by skkim on 2022/02/26.
 *
 * @author Kim Sung Kwon
 */
public class RuntimeExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
