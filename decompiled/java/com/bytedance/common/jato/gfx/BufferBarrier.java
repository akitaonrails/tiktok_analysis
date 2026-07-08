package com.bytedance.common.jato.gfx;

import X.C0VSJ;
import X.C2104908Ml;

/* JADX INFO: loaded from: classes27.dex */
public class BufferBarrier {
    public static volatile boolean LIZ;

    public static native void nativeBegin();

    public static native void nativeEnd();

    public static native void nativeHookLogs();

    public static native boolean nativeInit();

    public static synchronized void LIZ() {
        if (C2104908Ml.LIZIZ()) {
            if (LIZ) {
                return;
            }
            if (new C0VSJ("/data/local/tmp/barrier_disable").exists()) {
                return;
            }
            LIZ = nativeInit();
            if (new C0VSJ("/data/local/tmp/barrier_logs").exists()) {
                nativeHookLogs();
            }
        }
    }

    public static synchronized void LIZIZ() {
        if (LIZ) {
            nativeBegin();
        }
    }

    public static synchronized void LIZJ() {
        if (LIZ) {
            nativeEnd();
        }
    }
}
