package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationCompletion {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationCompletion(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        EffectEditorJniJNI.UIAnnotationCompletion_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        EffectEditorJniJNI.UIAnnotationCompletion_change_ownership(this, this.swigCPtr, true);
    }

    public void onSuccess() {
        EffectEditorJniJNI.UIAnnotationCompletion_onSuccess(this.swigCPtr, this);
    }

    public UIAnnotationCompletion() {
        this(EffectEditorJniJNI.new_UIAnnotationCompletion(), true);
        EffectEditorJniJNI.UIAnnotationCompletion_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationCompletion uIAnnotationCompletion) {
        if (uIAnnotationCompletion == null) {
            return 0L;
        }
        return uIAnnotationCompletion.swigCPtr;
    }

    public void onError(UIAnnotationErrorCode uIAnnotationErrorCode) {
        EffectEditorJniJNI.UIAnnotationCompletion_onError(this.swigCPtr, this, uIAnnotationErrorCode.swigValue());
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationCompletion(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
