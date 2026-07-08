package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEAlgorithmCallbackWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEAlgorithmCallbackWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        NLEMediaPublicJniJNI.NLEAlgorithmCallbackWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEAlgorithmCallbackWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEAlgorithmCallbackWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEAlgorithmCallbackWrapper(), true);
        NLEMediaPublicJniJNI.NLEAlgorithmCallbackWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper) {
        if (nLEAlgorithmCallbackWrapper == null) {
            return 0L;
        }
        return nLEAlgorithmCallbackWrapper.swigCPtr;
    }

    public void onProgress(float f) {
        NLEMediaPublicJniJNI.NLEAlgorithmCallbackWrapper_onProgress(this.swigCPtr, this, f);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEAlgorithmCallbackWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
