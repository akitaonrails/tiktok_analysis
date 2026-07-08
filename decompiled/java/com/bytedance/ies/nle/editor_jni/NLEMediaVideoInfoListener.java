package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMediaVideoInfoListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMediaVideoInfoListener(j);
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
        NLEMediaPublicJniJNI.NLEMediaVideoInfoListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEMediaVideoInfoListener_change_ownership(this, this.swigCPtr, true);
    }

    public NLEMediaVideoInfoListener() {
        this(NLEMediaPublicJniJNI.new_NLEMediaVideoInfoListener(), true);
        NLEMediaPublicJniJNI.NLEMediaVideoInfoListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaVideoInfoListener nLEMediaVideoInfoListener) {
        if (nLEMediaVideoInfoListener == null) {
            return 0L;
        }
        return nLEMediaVideoInfoListener.swigCPtr;
    }

    public void onDone(NLEMediaVideoInfo nLEMediaVideoInfo) {
        NLEMediaPublicJniJNI.NLEMediaVideoInfoListener_onDone(this.swigCPtr, this, NLEMediaVideoInfo.getCPtr(nLEMediaVideoInfo), nLEMediaVideoInfo);
    }

    public void onFail(int i) {
        NLEMediaPublicJniJNI.NLEMediaVideoInfoListener_onFail(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaVideoInfoListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
