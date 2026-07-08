package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Process;

/* JADX INFO: loaded from: classes27.dex */
public class SignalStackOpt {
    public static native void signalStackOptInternal(int i);

    static {
        C2104908Ml.LIZIZ();
    }

    public static void LIZ(int i) {
        if (Process.is64Bit() && C2104908Ml.LIZIZ()) {
            signalStackOptInternal(i);
        }
    }
}
