package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationCategory {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationCategory(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getIconPath() {
        return EffectEditorJniJNI.UIAnnotationCategory_getIconPath(this.swigCPtr, this);
    }

    public String getName() {
        return EffectEditorJniJNI.UIAnnotationCategory_getName(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationCategory uIAnnotationCategory) {
        if (uIAnnotationCategory == null) {
            return 0L;
        }
        return uIAnnotationCategory.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationCategory(String str, String str2) {
        this(EffectEditorJniJNI.new_UIAnnotationCategory(str, str2), true);
    }

    public UIAnnotationCategory(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
