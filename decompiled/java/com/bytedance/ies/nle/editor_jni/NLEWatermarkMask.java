package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEWatermarkMask {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEWatermarkMask(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getHeight() {
        return NLEMediaJniJNI.NLEWatermarkMask_height_get(this.swigCPtr, this);
    }

    public String getMaskImage() {
        return NLEMediaJniJNI.NLEWatermarkMask_maskImage_get(this.swigCPtr, this);
    }

    public int getWidth() {
        return NLEMediaJniJNI.NLEWatermarkMask_width_get(this.swigCPtr, this);
    }

    public int getXOffset() {
        return NLEMediaJniJNI.NLEWatermarkMask_xOffset_get(this.swigCPtr, this);
    }

    public int getYOffset() {
        return NLEMediaJniJNI.NLEWatermarkMask_yOffset_get(this.swigCPtr, this);
    }

    public NLEWatermarkMask() {
        this(NLEMediaJniJNI.new_NLEWatermarkMask(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEWatermarkMask nLEWatermarkMask) {
        if (nLEWatermarkMask == null) {
            return 0L;
        }
        return nLEWatermarkMask.swigCPtr;
    }

    public void setHeight(int i) {
        NLEMediaJniJNI.NLEWatermarkMask_height_set(this.swigCPtr, this, i);
    }

    public void setMaskImage(String str) {
        NLEMediaJniJNI.NLEWatermarkMask_maskImage_set(this.swigCPtr, this, str);
    }

    public void setWidth(int i) {
        NLEMediaJniJNI.NLEWatermarkMask_width_set(this.swigCPtr, this, i);
    }

    public void setXOffset(int i) {
        NLEMediaJniJNI.NLEWatermarkMask_xOffset_set(this.swigCPtr, this, i);
    }

    public void setYOffset(int i) {
        NLEMediaJniJNI.NLEWatermarkMask_yOffset_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEWatermarkMask(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
