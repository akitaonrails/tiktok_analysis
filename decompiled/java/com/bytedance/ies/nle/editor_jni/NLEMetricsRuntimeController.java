package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEMetricsRuntimeController {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMetricsRuntimeController(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getAudioGlitchCount() {
        return NLEMediaPublicJniJNI.NLEMetricsRuntimeController_getAudioGlitchCount(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMetricsRuntimeController nLEMetricsRuntimeController) {
        if (nLEMetricsRuntimeController == null) {
            return 0L;
        }
        return nLEMetricsRuntimeController.swigCPtr;
    }

    public int enableAudioGlitchMetrics(boolean z) {
        return NLEMediaPublicJniJNI.NLEMetricsRuntimeController_enableAudioGlitchMetrics(this.swigCPtr, this, z);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMetricsRuntimeController(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
