package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEResourceCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEResourceCallback(j);
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
        NLEMediaJniJNI.NLEResourceCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaJniJNI.NLEResourceCallback_change_ownership(this, this.swigCPtr, true);
    }

    public NLEResourceCallback() {
        this(NLEMediaJniJNI.new_NLEResourceCallback(), true);
        NLEMediaJniJNI.NLEResourceCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEResourceCallback nLEResourceCallback) {
        if (nLEResourceCallback == null) {
            return 0L;
        }
        return nLEResourceCallback.swigCPtr;
    }

    public void onProgress(float f) {
        NLEMediaJniJNI.NLEResourceCallback_onProgress(this.swigCPtr, this, f);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEResourceCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onError(int i, String str) {
        NLEMediaJniJNI.NLEResourceCallback_onError(this.swigCPtr, this, i, str);
    }

    public void onSuccess(String str, String str2, boolean z) {
        NLEMediaJniJNI.NLEResourceCallback_onSuccess(this.swigCPtr, this, str, str2, z);
    }
}
