package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLELoudnessDetectResult {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLELoudnessDetectResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double getAvgLoudness() {
        return NLEMediaJniJNI.NLELoudnessDetectResult_avgLoudness_get(this.swigCPtr, this);
    }

    public double getPeakLoudness() {
        return NLEMediaJniJNI.NLELoudnessDetectResult_peakLoudness_get(this.swigCPtr, this);
    }

    public int getResult() {
        return NLEMediaJniJNI.NLELoudnessDetectResult_result_get(this.swigCPtr, this);
    }

    public NLELoudnessDetectResult() {
        this(NLEMediaJniJNI.new_NLELoudnessDetectResult(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLELoudnessDetectResult nLELoudnessDetectResult) {
        if (nLELoudnessDetectResult == null) {
            return 0L;
        }
        return nLELoudnessDetectResult.swigCPtr;
    }

    public void setAvgLoudness(double d) {
        NLEMediaJniJNI.NLELoudnessDetectResult_avgLoudness_set(this.swigCPtr, this, d);
    }

    public void setPeakLoudness(double d) {
        NLEMediaJniJNI.NLELoudnessDetectResult_peakLoudness_set(this.swigCPtr, this, d);
    }

    public void setResult(int i) {
        NLEMediaJniJNI.NLELoudnessDetectResult_result_set(this.swigCPtr, this, i);
    }

    public NLELoudnessDetectResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
