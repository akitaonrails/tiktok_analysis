package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEInvisibleWatermarkTimeRange {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEInvisibleWatermarkTimeRange(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public long getEndTimeUs() {
        return NLEMediaPublicJniJNI.NLEInvisibleWatermarkTimeRange_endTimeUs_get(this.swigCPtr, this);
    }

    public long getStartTimeUs() {
        return NLEMediaPublicJniJNI.NLEInvisibleWatermarkTimeRange_startTimeUs_get(this.swigCPtr, this);
    }

    public NLEInvisibleWatermarkTimeRange() {
        this(NLEMediaPublicJniJNI.new_NLEInvisibleWatermarkTimeRange(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEInvisibleWatermarkTimeRange nLEInvisibleWatermarkTimeRange) {
        if (nLEInvisibleWatermarkTimeRange == null) {
            return 0L;
        }
        return nLEInvisibleWatermarkTimeRange.swigCPtr;
    }

    public void setEndTimeUs(long j) {
        NLEMediaPublicJniJNI.NLEInvisibleWatermarkTimeRange_endTimeUs_set(this.swigCPtr, this, j);
    }

    public void setStartTimeUs(long j) {
        NLEMediaPublicJniJNI.NLEInvisibleWatermarkTimeRange_startTimeUs_set(this.swigCPtr, this, j);
    }

    public NLEInvisibleWatermarkTimeRange(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
