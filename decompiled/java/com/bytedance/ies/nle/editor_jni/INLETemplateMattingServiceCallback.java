package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class INLETemplateMattingServiceCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_INLETemplateMattingServiceCallback(j);
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
        NLETemplateJNI.INLETemplateMattingServiceCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLETemplateJNI.INLETemplateMattingServiceCallback_change_ownership(this, this.swigCPtr, true);
    }

    public INLETemplateMattingServiceCallback() {
        this(NLETemplateJNI.new_INLETemplateMattingServiceCallback(), true);
        NLETemplateJNI.INLETemplateMattingServiceCallback_director_connect(this, this.swigCPtr, true, false);
    }

    public void onSuccess() {
        if (getClass() == INLETemplateMattingServiceCallback.class) {
            NLETemplateJNI.INLETemplateMattingServiceCallback_onSuccess(this.swigCPtr, this);
        } else {
            NLETemplateJNI.INLETemplateMattingServiceCallback_onSuccessSwigExplicitINLETemplateMattingServiceCallback(this.swigCPtr, this);
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback) {
        if (iNLETemplateMattingServiceCallback == null) {
            return 0L;
        }
        return iNLETemplateMattingServiceCallback.swigCPtr;
    }

    public void onProgress(float f) {
        if (getClass() == INLETemplateMattingServiceCallback.class) {
            NLETemplateJNI.INLETemplateMattingServiceCallback_onProgress(this.swigCPtr, this, f);
        } else {
            NLETemplateJNI.INLETemplateMattingServiceCallback_onProgressSwigExplicitINLETemplateMattingServiceCallback(this.swigCPtr, this, f);
        }
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLETemplateMattingServiceCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onError(NLETrackSlot nLETrackSlot, int i, String str) {
        if (getClass() == INLETemplateMattingServiceCallback.class) {
            NLETemplateJNI.INLETemplateMattingServiceCallback_onError(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, i, str);
        } else {
            NLETemplateJNI.INLETemplateMattingServiceCallback_onErrorSwigExplicitINLETemplateMattingServiceCallback(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, i, str);
        }
    }
}
