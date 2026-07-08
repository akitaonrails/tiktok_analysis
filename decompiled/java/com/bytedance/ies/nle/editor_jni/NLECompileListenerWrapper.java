package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLECompileListenerWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLECompileListenerWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void onCompileDone() {
        NLEMediaPublicJniJNI.NLECompileListenerWrapper_onCompileDone(this.swigCPtr, this);
    }

    public NLECompileListenerWrapper() {
        this(NLEMediaPublicJniJNI.new_NLECompileListenerWrapper(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLECompileListenerWrapper nLECompileListenerWrapper) {
        if (nLECompileListenerWrapper == null) {
            return 0L;
        }
        return nLECompileListenerWrapper.swigCPtr;
    }

    public void onCompileProgress(float f) {
        NLEMediaPublicJniJNI.NLECompileListenerWrapper_onCompileProgress(this.swigCPtr, this, f);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLECompileListenerWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onCompileError(int i, int i2, float f, String str) {
        NLEMediaPublicJniJNI.NLECompileListenerWrapper_onCompileError(this.swigCPtr, this, i, i2, f, str);
    }
}
