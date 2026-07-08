package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMediaABConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEMediaABConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean getEnableApiThreadCheck() {
        return NLEMediaJniJNI.NLEMediaABConfig_enableApiThreadCheck_get(this.swigCPtr, this);
    }

    public boolean getEnableApiTimeCost() {
        return NLEMediaJniJNI.NLEMediaABConfig_enableApiTimeCost_get(this.swigCPtr, this);
    }

    public boolean getEnableRenderWithStageModel() {
        return NLEMediaJniJNI.NLEMediaABConfig_enableRenderWithStageModel_get(this.swigCPtr, this);
    }

    public boolean getEnableSyncModelInAudio() {
        return NLEMediaJniJNI.NLEMediaABConfig_enableSyncModelInAudio_get(this.swigCPtr, this);
    }

    public double getThreadSamplingProb() {
        return NLEMediaJniJNI.NLEMediaABConfig_threadSamplingProb_get(this.swigCPtr, this);
    }

    public NLEMediaABConfig() {
        this(NLEMediaJniJNI.new_NLEMediaABConfig(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaABConfig nLEMediaABConfig) {
        if (nLEMediaABConfig == null) {
            return 0L;
        }
        return nLEMediaABConfig.swigCPtr;
    }

    public void setEnableApiThreadCheck(boolean z) {
        NLEMediaJniJNI.NLEMediaABConfig_enableApiThreadCheck_set(this.swigCPtr, this, z);
    }

    public void setEnableApiTimeCost(boolean z) {
        NLEMediaJniJNI.NLEMediaABConfig_enableApiTimeCost_set(this.swigCPtr, this, z);
    }

    public void setEnableRenderWithStageModel(boolean z) {
        NLEMediaJniJNI.NLEMediaABConfig_enableRenderWithStageModel_set(this.swigCPtr, this, z);
    }

    public void setEnableSyncModelInAudio(boolean z) {
        NLEMediaJniJNI.NLEMediaABConfig_enableSyncModelInAudio_set(this.swigCPtr, this, z);
    }

    public void setThreadSamplingProb(double d) {
        NLEMediaJniJNI.NLEMediaABConfig_threadSamplingProb_set(this.swigCPtr, this, d);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaABConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
