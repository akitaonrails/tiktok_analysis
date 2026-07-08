package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes35.dex */
public class NLEVQScoreWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEVQScoreWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void cancelVQScore() {
        NLEMediaPublicJniJNI.NLEVQScoreWrapper_cancelVQScore(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public NLEVQScoreWrapper(String str) {
        this(NLEMediaPublicJniJNI.new_NLEVQScoreWrapper(str), true);
    }

    public static long getCPtr(NLEVQScoreWrapper nLEVQScoreWrapper) {
        if (nLEVQScoreWrapper == null) {
            return 0L;
        }
        return nLEVQScoreWrapper.swigCPtr;
    }

    public NLEVQScoreWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void setResolutionLimit(int i, int i2) {
        NLEMediaPublicJniJNI.NLEVQScoreWrapper_setResolutionLimit(this.swigCPtr, this, i, i2);
    }

    public int startVQScore(NLEModel nLEModel, NLEVQScoreTimeRange nLEVQScoreTimeRange, int i, int i2, INLEVQScoreWrapperListener iNLEVQScoreWrapperListener) {
        return NLEMediaPublicJniJNI.NLEVQScoreWrapper_startVQScore(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, NLEVQScoreTimeRange.getCPtr(nLEVQScoreTimeRange), nLEVQScoreTimeRange, i, i2, INLEVQScoreWrapperListener.getCPtr(iNLEVQScoreWrapperListener), iNLEVQScoreWrapperListener);
    }
}
