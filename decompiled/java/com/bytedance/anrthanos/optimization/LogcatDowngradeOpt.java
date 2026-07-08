package com.bytedance.anrthanos.optimization;

/* JADX INFO: loaded from: classes4.dex */
public class LogcatDowngradeOpt {
    public static native int log_print();

    public static native int startDowngradeOptNative(int i, int i2);

    public static void println() {
        log_print();
    }

    public static int startOpt(int i, int i2) {
        return startDowngradeOptNative(i, i2);
    }
}
