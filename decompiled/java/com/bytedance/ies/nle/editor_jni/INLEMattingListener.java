package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class INLEMattingListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_INLEMattingListener(j);
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
        NLEMediaJniJNI.INLEMattingListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaJniJNI.INLEMattingListener_change_ownership(this, this.swigCPtr, true);
    }

    public void onMattingStartedCallback() {
        NLEMediaJniJNI.INLEMattingListener_onMattingStartedCallback(this.swigCPtr, this);
    }

    public INLEMattingListener() {
        this(NLEMediaJniJNI.new_INLEMattingListener(), true);
        NLEMediaJniJNI.INLEMattingListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEMattingListener iNLEMattingListener) {
        if (iNLEMattingListener == null) {
            return 0L;
        }
        return iNLEMattingListener.swigCPtr;
    }

    public void onMattingAddedCallback(String str) {
        NLEMediaJniJNI.INLEMattingListener_onMattingAddedCallback(this.swigCPtr, this, str);
    }

    public void onMattingRemovedCallback(String str) {
        NLEMediaJniJNI.INLEMattingListener_onMattingRemovedCallback(this.swigCPtr, this, str);
    }

    public boolean shouldInterceptMatting(NLETrackSlot nLETrackSlot) {
        return NLEMediaJniJNI.INLEMattingListener_shouldInterceptMatting(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEMattingListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onMattingDoneCallback(float f, String str) {
        NLEMediaJniJNI.INLEMattingListener_onMattingDoneCallback(this.swigCPtr, this, f, str);
    }

    public void onMattingErrorCallback(int i, String str) {
        NLEMediaJniJNI.INLEMattingListener_onMattingErrorCallback__SWIG_1(this.swigCPtr, this, i, str);
    }

    public void onMattingClipDoneCallback(String str, float f, float f2) {
        NLEMediaJniJNI.INLEMattingListener_onMattingClipDoneCallback(this.swigCPtr, this, str, f, f2);
    }

    public void onMattingErrorCallback(int i, int i2, float f) {
        NLEMediaJniJNI.INLEMattingListener_onMattingErrorCallback__SWIG_0(this.swigCPtr, this, i, i2, f);
    }

    public void onMattingInteractiveMaskCallback(String str, long j, String str2) {
        NLEMediaJniJNI.INLEMattingListener_onMattingInteractiveMaskCallback(this.swigCPtr, this, str, j, str2);
    }

    public void onMattingProgressCallback(String str, float f, float f2, boolean z) {
        NLEMediaJniJNI.INLEMattingListener_onMattingProgressCallback(this.swigCPtr, this, str, f, f2, z);
    }
}
