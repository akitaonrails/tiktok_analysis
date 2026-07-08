package com.ss.ttlivestreamer.core.utils;

import X.EnumC1083230eIL;

/* JADX INFO: loaded from: classes18.dex */
public class QualcommGpuUtils {
    public static native int nativeSendCommand(int i);

    public static void sendCommand(EnumC1083230eIL enumC1083230eIL) {
        nativeSendCommand(enumC1083230eIL.value);
    }
}
