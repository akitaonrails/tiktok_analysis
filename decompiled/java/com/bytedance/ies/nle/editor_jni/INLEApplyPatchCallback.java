package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class INLEApplyPatchCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_INLEApplyPatchCallback(j);
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
        NLEMediaPublicJniJNI.INLEApplyPatchCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.INLEApplyPatchCallback_change_ownership(this, this.swigCPtr, true);
    }

    public INLEApplyPatchCallback() {
        this(NLEMediaPublicJniJNI.new_INLEApplyPatchCallback(), true);
        NLEMediaPublicJniJNI.INLEApplyPatchCallback_director_connect(this, this.swigCPtr, true, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEApplyPatchCallback iNLEApplyPatchCallback) {
        if (iNLEApplyPatchCallback == null) {
            return 0L;
        }
        return iNLEApplyPatchCallback.swigCPtr;
    }

    public void onSuccess(NLEModel nLEModel) {
        NLEMediaPublicJniJNI.INLEApplyPatchCallback_onSuccess(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEApplyPatchCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onError(NLEModel nLEModel, String str) {
        NLEMediaPublicJniJNI.INLEApplyPatchCallback_onError(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, str);
    }

    public void onProgress(NLEModel nLEModel, float f) {
        NLEMediaPublicJniJNI.INLEApplyPatchCallback_onProgress(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, f);
    }
}
