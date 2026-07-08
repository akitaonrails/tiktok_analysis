package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEVEUserConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEVEUserConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void clearConfig() {
        NLEMediaJniJNI.NLEVEUserConfig_clearConfig(this.swigCPtr, this);
    }

    public NLEVEUserConfig() {
        this(NLEMediaJniJNI.new_NLEVEUserConfig(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVEUserConfig nLEVEUserConfig) {
        if (nLEVEUserConfig == null) {
            return 0L;
        }
        return nLEVEUserConfig.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEVEUserConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void addConfig(int i, int i2) {
        NLEMediaJniJNI.NLEVEUserConfig_addConfig__SWIG_3(this.swigCPtr, this, i, i2);
    }

    public void addConfig(int i, String str) {
        NLEMediaJniJNI.NLEVEUserConfig_addConfig__SWIG_5(this.swigCPtr, this, i, str);
    }

    public void addConfig(int i, boolean z) {
        NLEMediaJniJNI.NLEVEUserConfig_addConfig__SWIG_4(this.swigCPtr, this, i, z);
    }

    public void addConfig(String str, int i) {
        NLEMediaJniJNI.NLEVEUserConfig_addConfig__SWIG_0(this.swigCPtr, this, str, i);
    }

    public void addConfig(String str, String str2) {
        NLEMediaJniJNI.NLEVEUserConfig_addConfig__SWIG_2(this.swigCPtr, this, str, str2);
    }

    public void addConfig(String str, boolean z) {
        NLEMediaJniJNI.NLEVEUserConfig_addConfig__SWIG_1(this.swigCPtr, this, str, z);
    }
}
