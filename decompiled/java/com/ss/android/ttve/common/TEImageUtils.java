package com.ss.android.ttve.common;

import X.C2122208Tc;
import X.EnumC1284340jWi;
import com.ss.android.ttve.model.VEFrame;

/* JADX INFO: loaded from: classes21.dex */
public class TEImageUtils {
    public static native int nativeConvertFrame(VEFrame vEFrame, VEFrame vEFrame2, int i);

    static {
        C2122208Tc.LIZJ();
    }

    public static void LIZ(VEFrame vEFrame, VEFrame vEFrame2, EnumC1284340jWi enumC1284340jWi) {
        nativeConvertFrame(vEFrame, vEFrame2, enumC1284340jWi.ordinal());
    }
}
