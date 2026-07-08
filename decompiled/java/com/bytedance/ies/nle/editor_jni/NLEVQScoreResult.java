package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEVQScoreResult {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEVQScoreResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public float getAverageScore() {
        return NLEMediaJniJNI.NLEVQScoreResult_averageScore_get(this.swigCPtr, this);
    }

    public int getProcessedFrames() {
        return NLEMediaJniJNI.NLEVQScoreResult_processedFrames_get(this.swigCPtr, this);
    }

    public NLEVQScoreResult() {
        this(NLEMediaJniJNI.new_NLEVQScoreResult(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVQScoreResult nLEVQScoreResult) {
        if (nLEVQScoreResult == null) {
            return 0L;
        }
        return nLEVQScoreResult.swigCPtr;
    }

    public void setAverageScore(float f) {
        NLEMediaJniJNI.NLEVQScoreResult_averageScore_set(this.swigCPtr, this, f);
    }

    public void setProcessedFrames(int i) {
        NLEMediaJniJNI.NLEVQScoreResult_processedFrames_set(this.swigCPtr, this, i);
    }

    public NLEVQScoreResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
