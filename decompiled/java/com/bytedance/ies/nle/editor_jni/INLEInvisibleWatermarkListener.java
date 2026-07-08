package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class INLEInvisibleWatermarkListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_INLEInvisibleWatermarkListener(j);
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
        NLEMediaPublicJniJNI.INLEInvisibleWatermarkListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.INLEInvisibleWatermarkListener_change_ownership(this, this.swigCPtr, true);
    }

    public INLEInvisibleWatermarkListener() {
        this(NLEMediaPublicJniJNI.new_INLEInvisibleWatermarkListener(), true);
        NLEMediaPublicJniJNI.INLEInvisibleWatermarkListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEInvisibleWatermarkListener iNLEInvisibleWatermarkListener) {
        if (iNLEInvisibleWatermarkListener == null) {
            return 0L;
        }
        return iNLEInvisibleWatermarkListener.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEInvisibleWatermarkListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onFinished(VecString vecString, int i) {
        NLEMediaPublicJniJNI.INLEInvisibleWatermarkListener_onFinished(this.swigCPtr, this, VecString.getCPtr(vecString), vecString, i);
    }

    public void onProgress(long j, long j2, long j3) {
        NLEMediaPublicJniJNI.INLEInvisibleWatermarkListener_onProgress(this.swigCPtr, this, j, j2, j3);
    }
}
