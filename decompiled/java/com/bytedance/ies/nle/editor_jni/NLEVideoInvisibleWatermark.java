package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEVideoInvisibleWatermark {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEVideoInvisibleWatermark(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getAlgoVersion() {
        return NLEMediaJniJNI.NLEVideoInvisibleWatermark_algoVersion_get(this.swigCPtr, this);
    }

    public String getAlgorithmName() {
        return NLEMediaJniJNI.NLEVideoInvisibleWatermark_algorithmName_get(this.swigCPtr, this);
    }

    public boolean getEnableDelayInit() {
        return NLEMediaJniJNI.NLEVideoInvisibleWatermark_enableDelayInit_get(this.swigCPtr, this);
    }

    public long getEndWaterDuration() {
        return NLEMediaJniJNI.NLEVideoInvisibleWatermark_endWaterDuration_get(this.swigCPtr, this);
    }

    public int getMemLazyload() {
        return NLEMediaJniJNI.NLEVideoInvisibleWatermark_memLazyload_get(this.swigCPtr, this);
    }

    public String getModelPath() {
        return NLEMediaJniJNI.NLEVideoInvisibleWatermark_modelPath_get(this.swigCPtr, this);
    }

    public String getModelPathSec() {
        return NLEMediaJniJNI.NLEVideoInvisibleWatermark_modelPathSec_get(this.swigCPtr, this);
    }

    public int getPFlag() {
        return NLEMediaJniJNI.NLEVideoInvisibleWatermark_pFlag_get(this.swigCPtr, this);
    }

    public int getWatermarkInterval() {
        return NLEMediaJniJNI.NLEVideoInvisibleWatermark_watermarkInterval_get(this.swigCPtr, this);
    }

    public String getWatermarkStr() {
        return NLEMediaJniJNI.NLEVideoInvisibleWatermark_watermarkStr_get(this.swigCPtr, this);
    }

    public NLEVideoInvisibleWatermark() {
        this(NLEMediaJniJNI.new_NLEVideoInvisibleWatermark(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark) {
        if (nLEVideoInvisibleWatermark == null) {
            return 0L;
        }
        return nLEVideoInvisibleWatermark.swigCPtr;
    }

    public void setAlgoVersion(int i) {
        NLEMediaJniJNI.NLEVideoInvisibleWatermark_algoVersion_set(this.swigCPtr, this, i);
    }

    public void setAlgorithmName(String str) {
        NLEMediaJniJNI.NLEVideoInvisibleWatermark_algorithmName_set(this.swigCPtr, this, str);
    }

    public void setEnableDelayInit(boolean z) {
        NLEMediaJniJNI.NLEVideoInvisibleWatermark_enableDelayInit_set(this.swigCPtr, this, z);
    }

    public void setEndWaterDuration(long j) {
        NLEMediaJniJNI.NLEVideoInvisibleWatermark_endWaterDuration_set(this.swigCPtr, this, j);
    }

    public void setMemLazyload(int i) {
        NLEMediaJniJNI.NLEVideoInvisibleWatermark_memLazyload_set(this.swigCPtr, this, i);
    }

    public void setModelPath(String str) {
        NLEMediaJniJNI.NLEVideoInvisibleWatermark_modelPath_set(this.swigCPtr, this, str);
    }

    public void setModelPathSec(String str) {
        NLEMediaJniJNI.NLEVideoInvisibleWatermark_modelPathSec_set(this.swigCPtr, this, str);
    }

    public void setPFlag(int i) {
        NLEMediaJniJNI.NLEVideoInvisibleWatermark_pFlag_set(this.swigCPtr, this, i);
    }

    public void setWatermarkInterval(int i) {
        NLEMediaJniJNI.NLEVideoInvisibleWatermark_watermarkInterval_set(this.swigCPtr, this, i);
    }

    public void setWatermarkStr(String str) {
        NLEMediaJniJNI.NLEVideoInvisibleWatermark_watermarkStr_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEVideoInvisibleWatermark(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
