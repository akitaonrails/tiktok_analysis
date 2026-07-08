package com.bytedance.apm.block.evil;

/* JADX INFO: loaded from: classes14.dex */
public class EvilMethodSwitcher {
    public static long getEvilThresholdMs() {
        return 1000L;
    }

    public static long getLaunchEvilThresholdMs() {
        return 100L;
    }

    public static boolean isLaunchLimitEvilMethodDepth() {
        return false;
    }

    public static boolean isLimitEvilMethodDepth() {
        return false;
    }

    public static boolean isMessageKeyEnable() {
        return false;
    }

    public static boolean isOpenLaunchEvilMethod() {
        return false;
    }
}
