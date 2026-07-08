package com.bytedance.common.jato.soload;

import X.C2104908Ml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class DlopenPriorityManager {
    public static native void nGuardDlopenThreadPriority(int i, boolean z);

    public static void LIZ(int i, boolean z) {
        if (!C2104908Ml.LIZIZ()) {
            return;
        }
        try {
            nGuardDlopenThreadPriority(i, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
