package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes35.dex */
public class DynamicLightWaveUtil {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_DynamicLightWaveUtil(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int cancelCompile() {
        return NLEMediaPublicJniJNI.DynamicLightWaveUtil_cancelCompile(this.swigCPtr, this);
    }

    public int destroy() {
        return NLEMediaPublicJniJNI.DynamicLightWaveUtil_destroy(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DynamicLightWaveUtil dynamicLightWaveUtil) {
        if (dynamicLightWaveUtil == null) {
            return 0L;
        }
        return dynamicLightWaveUtil.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DynamicLightWaveUtil(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public int insertClipAndFilter(SpeedConfig speedConfig, String str) {
        return NLEMediaPublicJniJNI.DynamicLightWaveUtil_insertClipAndFilter(this.swigCPtr, this, SpeedConfig.getCPtr(speedConfig), speedConfig, str);
    }

    public int compile(String str, boolean z, DLWCallback dLWCallback) {
        return NLEMediaPublicJniJNI.DynamicLightWaveUtil_compile(this.swigCPtr, this, str, z, DLWCallback.getCPtr(dLWCallback), dLWCallback);
    }

    public DynamicLightWaveUtil(long j, long j2, long j3, String str, String str2) {
        this(NLEMediaPublicJniJNI.new_DynamicLightWaveUtil(j, j2, j3, str, str2), true);
    }
}
