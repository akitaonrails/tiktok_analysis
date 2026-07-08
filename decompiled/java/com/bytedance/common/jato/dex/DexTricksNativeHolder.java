package com.bytedance.common.jato.dex;

import X.C2104908Ml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class DexTricksNativeHolder {
    public static boolean sInited;

    public static native int dvmVerifyEnableNative();

    public static native int dvmVerifyNoneNative();

    public static native int verifyEnableAbove15Native();

    public static native int verifyEnableNative();

    public static native int verifyNoneAbove15Native();

    public static native int verifyNoneNative(int i);

    public static synchronized boolean ensureInited() {
        if (!sInited && C2104908Ml.LIZIZ()) {
            sInited = true;
        }
        return sInited;
    }

    public static int dvmVerifyEnable() {
        if (ensureInited()) {
            try {
                return dvmVerifyEnableNative();
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return -1;
    }

    public static int dvmVerifyNone() {
        if (ensureInited()) {
            try {
                return dvmVerifyNoneNative();
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return -1;
    }

    public static int verifyEnable() {
        if (ensureInited()) {
            return verifyEnableNative();
        }
        return -1;
    }

    public static int verifyEnable15() {
        if (ensureInited()) {
            return verifyEnableAbove15Native();
        }
        return -1;
    }

    public static int verifyNone15() {
        if (ensureInited()) {
            return verifyNoneAbove15Native();
        }
        return -1;
    }

    public static int verifyNone(int i) {
        if (ensureInited()) {
            return verifyNoneNative(i);
        }
        return -1;
    }
}
