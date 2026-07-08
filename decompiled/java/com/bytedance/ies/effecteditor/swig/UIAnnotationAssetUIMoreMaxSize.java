package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes26.dex */
public class UIAnnotationAssetUIMoreMaxSize {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationAssetUIMoreMaxSize(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double getHeight() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMoreMaxSize_getHeight(this.swigCPtr, this);
    }

    public double getWidth() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMoreMaxSize_getWidth(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationAssetUIMoreMaxSize uIAnnotationAssetUIMoreMaxSize) {
        if (uIAnnotationAssetUIMoreMaxSize == null) {
            return 0L;
        }
        return uIAnnotationAssetUIMoreMaxSize.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationAssetUIMoreMaxSize(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
