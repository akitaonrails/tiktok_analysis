package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes35.dex */
public class INLEVQScoreWrapperListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_INLEVQScoreWrapperListener(j);
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
        NLEMediaPublicJniJNI.INLEVQScoreWrapperListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.INLEVQScoreWrapperListener_change_ownership(this, this.swigCPtr, true);
    }

    public INLEVQScoreWrapperListener() {
        this(NLEMediaPublicJniJNI.new_INLEVQScoreWrapperListener(), true);
        NLEMediaPublicJniJNI.INLEVQScoreWrapperListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEVQScoreWrapperListener iNLEVQScoreWrapperListener) {
        if (iNLEVQScoreWrapperListener == null) {
            return 0L;
        }
        return iNLEVQScoreWrapperListener.swigCPtr;
    }

    public void onFinished(VecDouble vecDouble) {
        NLEMediaPublicJniJNI.INLEVQScoreWrapperListener_onFinished(this.swigCPtr, this, VecDouble.getCPtr(vecDouble), vecDouble);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEVQScoreWrapperListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onProgress(int i, int i2, double d) {
        NLEMediaPublicJniJNI.INLEVQScoreWrapperListener_onProgress(this.swigCPtr, this, i, i2, d);
    }
}
