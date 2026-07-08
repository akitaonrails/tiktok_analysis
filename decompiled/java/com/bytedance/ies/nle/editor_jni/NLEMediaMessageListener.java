package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMediaMessageListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEMediaMessageListener(j);
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
        NLEMediaJniJNI.NLEMediaMessageListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaJniJNI.NLEMediaMessageListener_change_ownership(this, this.swigCPtr, true);
    }

    public NLEMediaMessageListener() {
        this(NLEMediaJniJNI.new_NLEMediaMessageListener(), true);
        NLEMediaJniJNI.NLEMediaMessageListener_director_connect(this, this.swigCPtr, true, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaMessageListener nLEMediaMessageListener) {
        if (nLEMediaMessageListener == null) {
            return 0L;
        }
        return nLEMediaMessageListener.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaMessageListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onKeyFrameProcess(String str, long j, String str2) {
        NLEMediaJniJNI.NLEMediaMessageListener_onKeyFrameProcess(this.swigCPtr, this, str, j, str2);
    }

    public void onError(int i, int i2, float f, String str) {
        NLEMediaJniJNI.NLEMediaMessageListener_onError(this.swigCPtr, this, i, i2, f, str);
    }

    public void onInfo(int i, int i2, float f, String str) {
        NLEMediaJniJNI.NLEMediaMessageListener_onInfo(this.swigCPtr, this, i, i2, f, str);
    }

    public void onKeyFrameProcessWithType(String str, long j, String str2, KeyframeType keyframeType) {
        NLEMediaJniJNI.NLEMediaMessageListener_onKeyFrameProcessWithType(this.swigCPtr, this, str, j, str2, keyframeType.swigValue());
    }
}
