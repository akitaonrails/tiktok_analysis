package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEVEGlobalConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEVEGlobalConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void clearConfig() {
        NLEMediaJniJNI.NLEVEGlobalConfig_clearConfig(this.swigCPtr, this);
    }

    public NLEVEGlobalConfig() {
        this(NLEMediaJniJNI.new_NLEVEGlobalConfig(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVEGlobalConfig nLEVEGlobalConfig) {
        if (nLEVEGlobalConfig == null) {
            return 0L;
        }
        return nLEVEGlobalConfig.swigCPtr;
    }

    public void enableCheckCanvasFilter(boolean z) {
        NLEMediaJniJNI.NLEVEGlobalConfig_enableCheckCanvasFilter(this.swigCPtr, this, z);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEVEGlobalConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void addConfig(int i, int i2) {
        NLEMediaJniJNI.NLEVEGlobalConfig_addConfig__SWIG_2(this.swigCPtr, this, i, i2);
    }

    public void addConfig(int i, boolean z) {
        NLEMediaJniJNI.NLEVEGlobalConfig_addConfig__SWIG_3(this.swigCPtr, this, i, z);
    }

    public void addConfig(String str, int i) {
        NLEMediaJniJNI.NLEVEGlobalConfig_addConfig__SWIG_0(this.swigCPtr, this, str, i);
    }

    public void addConfig(String str, boolean z) {
        NLEMediaJniJNI.NLEVEGlobalConfig_addConfig__SWIG_1(this.swigCPtr, this, str, z);
    }
}
