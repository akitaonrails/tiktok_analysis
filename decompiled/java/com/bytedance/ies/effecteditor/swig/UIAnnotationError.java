package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationError {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationError(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public UIAnnotationErrorCode getErrorCode() {
        return UIAnnotationErrorCode.swigToEnum(EffectEditorJniJNI.UIAnnotationError_getErrorCode(this.swigCPtr, this));
    }

    public UIAnnotationError() {
        this(EffectEditorJniJNI.new_UIAnnotationError(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationError uIAnnotationError) {
        if (uIAnnotationError == null) {
            return 0L;
        }
        return uIAnnotationError.swigCPtr;
    }

    public void setErrorCode(UIAnnotationErrorCode uIAnnotationErrorCode) {
        EffectEditorJniJNI.UIAnnotationError_setErrorCode(this.swigCPtr, this, uIAnnotationErrorCode.swigValue());
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationError(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void addErrorCode(UIAnnotationError uIAnnotationError, UIAnnotationErrorCode uIAnnotationErrorCode) {
        EffectEditorJniJNI.UIAnnotationError_addErrorCode(getCPtr(uIAnnotationError), uIAnnotationError, uIAnnotationErrorCode.swigValue());
    }

    public static void removeErrorCode(UIAnnotationError uIAnnotationError, UIAnnotationErrorCode uIAnnotationErrorCode) {
        EffectEditorJniJNI.UIAnnotationError_removeErrorCode(getCPtr(uIAnnotationError), uIAnnotationError, uIAnnotationErrorCode.swigValue());
    }
}
