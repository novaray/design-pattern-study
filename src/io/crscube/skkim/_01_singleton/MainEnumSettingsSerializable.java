package io.crscube.skkim._01_singleton;

import java.io.*;

/**
 * Created by skkim on 2022/02/26.
 *
 * @author Kim Sung Kwon
 */
public class MainEnumSettingsSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final EnumSettings settings1 = EnumSettings.INSTANCE;

        EnumSettings settings2 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (EnumSettings) in.readObject();
        }

        System.out.println(settings1 == settings2); //true
    }
}
