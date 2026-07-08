package com.tiktok.strategycenter.bytedt;

/* JADX INFO: loaded from: classes19.dex */
public final class TTMStrategyCenterByteDTEngineManager {
    public final String engineKey;
    public long mEnginePtr;
    public final String ruleName;

    private final native TTMStrategyCenterByteDTModelInfo nativeGetModelInfo(long j);

    private final native boolean nativeLoadByteDTModelByPath(String str, boolean z, long j);

    private final native TTMStrategyCenterByteDTPredictResult nativePredictByteDT(float[] fArr, int i, boolean z, long j);

    private final native float[] nativePredictByteDTRaw(float[] fArr, int i, long j);

    private final native boolean nativeReleaseByteDTManger(String str, String str2, long j);

    public final TTMStrategyCenterByteDTModelInfo getByteDTModelInfo() {
        long j = this.mEnginePtr;
        return j == 0 ? new TTMStrategyCenterByteDTModelInfo(-1, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f) : nativeGetModelInfo(j);
    }

    public final boolean releaseByteDTManger() {
        long j = this.mEnginePtr;
        if (j == 0) {
            return false;
        }
        boolean zNativeReleaseByteDTManger = nativeReleaseByteDTManger(this.ruleName, this.engineKey, j);
        if (zNativeReleaseByteDTManger) {
            this.mEnginePtr = 0L;
        }
        return zNativeReleaseByteDTManger;
    }

    public final float[] predictByteDTRaw(float[] fArr) {
        long j = this.mEnginePtr;
        if (j == 0) {
            return null;
        }
        return nativePredictByteDTRaw(fArr, fArr.length, j);
    }

    public final boolean loadByteDTModelByPath(String str, boolean z) {
        if (this.mEnginePtr == 0 || str.length() == 0) {
            return false;
        }
        return nativeLoadByteDTModelByPath(str, z, this.mEnginePtr);
    }

    public final TTMStrategyCenterByteDTPredictResult predictByteDT(float[] fArr, boolean z) {
        long j = this.mEnginePtr;
        if (j == 0) {
            return new TTMStrategyCenterByteDTPredictResult(-1, -1, null, null, null, null);
        }
        TTMStrategyCenterByteDTPredictResult tTMStrategyCenterByteDTPredictResultNativePredictByteDT = nativePredictByteDT(fArr, fArr.length, z, j);
        if (tTMStrategyCenterByteDTPredictResultNativePredictByteDT == null) {
            return new TTMStrategyCenterByteDTPredictResult(-1, -1, null, null, null, null);
        }
        return tTMStrategyCenterByteDTPredictResultNativePredictByteDT;
    }

    public TTMStrategyCenterByteDTEngineManager(long j, String str, String str2) {
        this.mEnginePtr = j;
        this.ruleName = str;
        this.engineKey = str2;
    }
}
