package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes35.dex */
public class NLEVQScoreTimeRange {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEVQScoreTimeRange(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public long getEndTimeUs() {
        return NLEMediaPublicJniJNI.NLEVQScoreTimeRange_endTimeUs_get(this.swigCPtr, this);
    }

    public long getIntervalUs() {
        return NLEMediaPublicJniJNI.NLEVQScoreTimeRange_intervalUs_get(this.swigCPtr, this);
    }

    public long getStartTimeUs() {
        return NLEMediaPublicJniJNI.NLEVQScoreTimeRange_startTimeUs_get(this.swigCPtr, this);
    }

    public NLEVQScoreTimeRange() {
        this(NLEMediaPublicJniJNI.new_NLEVQScoreTimeRange(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVQScoreTimeRange nLEVQScoreTimeRange) {
        if (nLEVQScoreTimeRange == null) {
            return 0L;
        }
        return nLEVQScoreTimeRange.swigCPtr;
    }

    public void setEndTimeUs(long j) {
        NLEMediaPublicJniJNI.NLEVQScoreTimeRange_endTimeUs_set(this.swigCPtr, this, j);
    }

    public void setIntervalUs(long j) {
        NLEMediaPublicJniJNI.NLEVQScoreTimeRange_intervalUs_set(this.swigCPtr, this, j);
    }

    public void setStartTimeUs(long j) {
        NLEMediaPublicJniJNI.NLEVQScoreTimeRange_startTimeUs_set(this.swigCPtr, this, j);
    }

    public NLEVQScoreTimeRange(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
