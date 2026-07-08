package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLETimeRange {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLETimeRange(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public long getIn() {
        return NLEMediaJniJNI.NLETimeRange_in_get(this.swigCPtr, this);
    }

    public long getOut() {
        return NLEMediaJniJNI.NLETimeRange_out_get(this.swigCPtr, this);
    }

    public NLETimeRange() {
        this(NLEMediaJniJNI.new_NLETimeRange(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLETimeRange nLETimeRange) {
        if (nLETimeRange == null) {
            return 0L;
        }
        return nLETimeRange.swigCPtr;
    }

    public void setIn(long j) {
        NLEMediaJniJNI.NLETimeRange_in_set(this.swigCPtr, this, j);
    }

    public void setOut(long j) {
        NLEMediaJniJNI.NLETimeRange_out_set(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLETimeRange(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
