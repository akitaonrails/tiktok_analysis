package com.ss.android.ttve.algorithm;

/* JADX INFO: loaded from: classes36.dex */
public class LowLightEnhance {
    private native LowLightEnhanceResult nativeLowLightEnhanceGetOutput(long j, LowLightEnhanceResult lowLightEnhanceResult);

    private native long nativeLowLightEnhanceInit(int i, int i2, boolean z);

    private native int nativeLowLightEnhanceProcess(long j, int i, int i2, int i3, float[] fArr);

    private native int nativeLowLightEnhanceRelease(long j);
}
