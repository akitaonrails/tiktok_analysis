package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationUIMore {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationUIMore(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationUIMore_getClassName(this.swigCPtr, this);
    }

    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectEditorJniJNI.UIAnnotationUIMore_getUIType(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationUIMore_className();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationUIMore uIAnnotationUIMore) {
        if (uIAnnotationUIMore == null) {
            return 0L;
        }
        return uIAnnotationUIMore.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationUIMore(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
