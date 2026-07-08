package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEBeatTrackingParam {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEBeatTrackingParam(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getFilePath() {
        return NLEMediaJniJNI.NLEBeatTrackingParam_filePath_get(this.swigCPtr, this);
    }

    public String getModelPath() {
        return NLEMediaJniJNI.NLEBeatTrackingParam_modelPath_get(this.swigCPtr, this);
    }

    public long getSlice() {
        return NLEMediaJniJNI.NLEBeatTrackingParam_slice_get(this.swigCPtr, this);
    }

    public long getTrimIn() {
        return NLEMediaJniJNI.NLEBeatTrackingParam_trimIn_get(this.swigCPtr, this);
    }

    public long getTrimOut() {
        return NLEMediaJniJNI.NLEBeatTrackingParam_trimOut_get(this.swigCPtr, this);
    }

    public NLEBeatTrackingParam() {
        this(NLEMediaJniJNI.new_NLEBeatTrackingParam(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEBeatTrackingParam nLEBeatTrackingParam) {
        if (nLEBeatTrackingParam == null) {
            return 0L;
        }
        return nLEBeatTrackingParam.swigCPtr;
    }

    public void setFilePath(String str) {
        NLEMediaJniJNI.NLEBeatTrackingParam_filePath_set(this.swigCPtr, this, str);
    }

    public void setModelPath(String str) {
        NLEMediaJniJNI.NLEBeatTrackingParam_modelPath_set(this.swigCPtr, this, str);
    }

    public void setSlice(long j) {
        NLEMediaJniJNI.NLEBeatTrackingParam_slice_set(this.swigCPtr, this, j);
    }

    public void setTrimIn(long j) {
        NLEMediaJniJNI.NLEBeatTrackingParam_trimIn_set(this.swigCPtr, this, j);
    }

    public void setTrimOut(long j) {
        NLEMediaJniJNI.NLEBeatTrackingParam_trimOut_set(this.swigCPtr, this, j);
    }

    public NLEBeatTrackingParam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
