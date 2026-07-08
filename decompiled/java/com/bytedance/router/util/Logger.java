package com.bytedance.router.util;

/* JADX INFO: loaded from: classes33.dex */
public final class Logger {
    public static boolean sDebug;

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void i(String str, String str2) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    public static boolean isDebug() {
        return sDebug;
    }

    public static void d(String str) {
        d("SmartRouter", str);
    }

    public static void e(String str) {
        e("SmartRouter", str);
    }

    public static void i(String str) {
        i("SmartRouter", str);
    }

    public static void setDebug(boolean z) {
        sDebug = z;
    }

    public static void v(String str) {
        v("SmartRouter", str);
    }

    public static void w(String str) {
        w("SmartRouter", str);
    }
}
