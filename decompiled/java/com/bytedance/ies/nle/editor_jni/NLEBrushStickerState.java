package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEBrushStickerState {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEBrushStickerState(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean getBboxCalculatedByPixel() {
        return NLEMediaJniJNI.NLEBrushStickerState_bboxCalculatedByPixel_get(this.swigCPtr, this);
    }

    public float getBottom() {
        return NLEMediaJniJNI.NLEBrushStickerState_bottom_get(this.swigCPtr, this);
    }

    public float getLeft() {
        return NLEMediaJniJNI.NLEBrushStickerState_left_get(this.swigCPtr, this);
    }

    public long getMemCacheSize() {
        return NLEMediaJniJNI.NLEBrushStickerState_memCacheSize_get(this.swigCPtr, this);
    }

    public int getRedo_count() {
        return NLEMediaJniJNI.NLEBrushStickerState_redo_count_get(this.swigCPtr, this);
    }

    public float getRight() {
        return NLEMediaJniJNI.NLEBrushStickerState_right_get(this.swigCPtr, this);
    }

    public float getStroke_size() {
        return NLEMediaJniJNI.NLEBrushStickerState_stroke_size_get(this.swigCPtr, this);
    }

    public float getTop() {
        return NLEMediaJniJNI.NLEBrushStickerState_top_get(this.swigCPtr, this);
    }

    public long getTotalCacheSize() {
        return NLEMediaJniJNI.NLEBrushStickerState_totalCacheSize_get(this.swigCPtr, this);
    }

    public int getUndo_count() {
        return NLEMediaJniJNI.NLEBrushStickerState_undo_count_get(this.swigCPtr, this);
    }

    public NLEBrushStickerState() {
        this(NLEMediaJniJNI.new_NLEBrushStickerState(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEBrushStickerState nLEBrushStickerState) {
        if (nLEBrushStickerState == null) {
            return 0L;
        }
        return nLEBrushStickerState.swigCPtr;
    }

    public void setBboxCalculatedByPixel(boolean z) {
        NLEMediaJniJNI.NLEBrushStickerState_bboxCalculatedByPixel_set(this.swigCPtr, this, z);
    }

    public void setBottom(float f) {
        NLEMediaJniJNI.NLEBrushStickerState_bottom_set(this.swigCPtr, this, f);
    }

    public void setLeft(float f) {
        NLEMediaJniJNI.NLEBrushStickerState_left_set(this.swigCPtr, this, f);
    }

    public void setMemCacheSize(long j) {
        NLEMediaJniJNI.NLEBrushStickerState_memCacheSize_set(this.swigCPtr, this, j);
    }

    public void setRedo_count(int i) {
        NLEMediaJniJNI.NLEBrushStickerState_redo_count_set(this.swigCPtr, this, i);
    }

    public void setRight(float f) {
        NLEMediaJniJNI.NLEBrushStickerState_right_set(this.swigCPtr, this, f);
    }

    public void setStroke_size(float f) {
        NLEMediaJniJNI.NLEBrushStickerState_stroke_size_set(this.swigCPtr, this, f);
    }

    public void setTop(float f) {
        NLEMediaJniJNI.NLEBrushStickerState_top_set(this.swigCPtr, this, f);
    }

    public void setTotalCacheSize(long j) {
        NLEMediaJniJNI.NLEBrushStickerState_totalCacheSize_set(this.swigCPtr, this, j);
    }

    public void setUndo_count(int i) {
        NLEMediaJniJNI.NLEBrushStickerState_undo_count_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEBrushStickerState(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
