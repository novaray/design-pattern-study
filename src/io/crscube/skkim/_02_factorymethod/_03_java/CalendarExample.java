package io.crscube.skkim._02_factorymethod._03_java;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by gimseong-gwon on 2022/03/01.
 */
public class CalendarExample {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());
    }
}
