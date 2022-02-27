package io.crscube.skkim._01_singleton;

import java.io.*;

/**
 * Created by gimseong-gwon on 2022/02/24.
 */
public class MainSerializableSingletonDestroy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final SettingsSerializable settings1 = SettingsSerializable.getInstance();
        SettingsSerializable settings2 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (SettingsSerializable) in.readObject();
        }

        System.out.println(settings1 == settings2);
    }
}
