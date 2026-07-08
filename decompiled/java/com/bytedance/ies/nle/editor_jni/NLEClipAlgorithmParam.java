package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEClipAlgorithmParam {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEClipAlgorithmParam(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getBingoEffect() {
        return NLEMediaJniJNI.NLEClipAlgorithmParam_bingoEffect_get(this.swigCPtr, this);
    }

    public int getIndex() {
        return NLEMediaJniJNI.NLEClipAlgorithmParam_index_get(this.swigCPtr, this);
    }

    public long getRange() {
        return NLEMediaJniJNI.NLEClipAlgorithmParam_range_get(this.swigCPtr, this);
    }

    public int getRotate() {
        return NLEMediaJniJNI.NLEClipAlgorithmParam_rotate_get(this.swigCPtr, this);
    }

    public long getTrimIn() {
        return NLEMediaJniJNI.NLEClipAlgorithmParam_trimIn_get(this.swigCPtr, this);
    }

    public long getTrimOut() {
        return NLEMediaJniJNI.NLEClipAlgorithmParam_trimOut_get(this.swigCPtr, this);
    }

    public NLEClipAlgorithmParam() {
        this(NLEMediaJniJNI.new_NLEClipAlgorithmParam(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEClipAlgorithmParam nLEClipAlgorithmParam) {
        if (nLEClipAlgorithmParam == null) {
            return 0L;
        }
        return nLEClipAlgorithmParam.swigCPtr;
    }

    public void setBingoEffect(int i) {
        NLEMediaJniJNI.NLEClipAlgorithmParam_bingoEffect_set(this.swigCPtr, this, i);
    }

    public void setIndex(int i) {
        NLEMediaJniJNI.NLEClipAlgorithmParam_index_set(this.swigCPtr, this, i);
    }

    public void setRange(long j) {
        NLEMediaJniJNI.NLEClipAlgorithmParam_range_set(this.swigCPtr, this, j);
    }

    public void setRotate(int i) {
        NLEMediaJniJNI.NLEClipAlgorithmParam_rotate_set(this.swigCPtr, this, i);
    }

    public void setTrimIn(long j) {
        NLEMediaJniJNI.NLEClipAlgorithmParam_trimIn_set(this.swigCPtr, this, j);
    }

    public void setTrimOut(long j) {
        NLEMediaJniJNI.NLEClipAlgorithmParam_trimOut_set(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEClipAlgorithmParam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
