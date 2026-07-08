package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes26.dex */
public class UIAnnotationAssetUIMoreAutoCutting {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationAssetUIMoreAutoCutting(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean getEnabled() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMoreAutoCutting_getEnabled(this.swigCPtr, this);
    }

    public double getHeight() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMoreAutoCutting_getHeight(this.swigCPtr, this);
    }

    public double getWidth() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMoreAutoCutting_getWidth(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationAssetUIMoreAutoCutting uIAnnotationAssetUIMoreAutoCutting) {
        if (uIAnnotationAssetUIMoreAutoCutting == null) {
            return 0L;
        }
        return uIAnnotationAssetUIMoreAutoCutting.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationAssetUIMoreAutoCutting(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
