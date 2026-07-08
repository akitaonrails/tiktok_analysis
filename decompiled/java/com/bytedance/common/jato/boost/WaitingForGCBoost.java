package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import com.bytedance.common.jato.JatoXL;

/* JADX INFO: loaded from: classes27.dex */
public class WaitingForGCBoost {
    public static native boolean nBoost(int i);

    public static native boolean nUnboost();

    public static void LIZIZ() {
        if (JatoXL.isInited() && C2104908Ml.LIZ()) {
            nUnboost();
        }
    }

    public static void LIZ(int i) {
        if (JatoXL.isInited() && C2104908Ml.LIZ()) {
            nBoost(i);
        }
    }
}
