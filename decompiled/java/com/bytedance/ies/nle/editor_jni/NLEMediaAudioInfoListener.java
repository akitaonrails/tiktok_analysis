package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMediaAudioInfoListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMediaAudioInfoListener(j);
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
        NLEMediaPublicJniJNI.NLEMediaAudioInfoListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEMediaAudioInfoListener_change_ownership(this, this.swigCPtr, true);
    }

    public NLEMediaAudioInfoListener() {
        this(NLEMediaPublicJniJNI.new_NLEMediaAudioInfoListener(), true);
        NLEMediaPublicJniJNI.NLEMediaAudioInfoListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaAudioInfoListener nLEMediaAudioInfoListener) {
        if (nLEMediaAudioInfoListener == null) {
            return 0L;
        }
        return nLEMediaAudioInfoListener.swigCPtr;
    }

    public void onDone(NLEMediaAudioInfo nLEMediaAudioInfo) {
        NLEMediaPublicJniJNI.NLEMediaAudioInfoListener_onDone(this.swigCPtr, this, NLEMediaAudioInfo.getCPtr(nLEMediaAudioInfo), nLEMediaAudioInfo);
    }

    public void onFail(int i) {
        NLEMediaPublicJniJNI.NLEMediaAudioInfoListener_onFail(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaAudioInfoListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
