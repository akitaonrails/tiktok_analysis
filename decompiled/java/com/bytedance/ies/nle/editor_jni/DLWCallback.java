package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class DLWCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_DLWCallback(j);
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
        NLEMediaPublicJniJNI.DLWCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.DLWCallback_change_ownership(this, this.swigCPtr, true);
    }

    public void compileDone() {
        NLEMediaPublicJniJNI.DLWCallback_compileDone(this.swigCPtr, this);
    }

    public DLWCallback() {
        this(NLEMediaPublicJniJNI.new_DLWCallback(), true);
        NLEMediaPublicJniJNI.DLWCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DLWCallback dLWCallback) {
        if (dLWCallback == null) {
            return 0L;
        }
        return dLWCallback.swigCPtr;
    }

    public void compileError(int i) {
        NLEMediaPublicJniJNI.DLWCallback_compileError(this.swigCPtr, this, i);
    }

    public void onProgress(float f) {
        NLEMediaPublicJniJNI.DLWCallback_onProgress(this.swigCPtr, this, f);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DLWCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
