package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLESafetyApplyPatchToken {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLESafetyApplyPatchToken(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void cancel() {
        NLEMediaPublicJniJNI.NLESafetyApplyPatchToken_cancel(this.swigCPtr, this);
    }

    public void pause() {
        NLEMediaPublicJniJNI.NLESafetyApplyPatchToken_pause(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLESafetyApplyPatchToken nLESafetyApplyPatchToken) {
        if (nLESafetyApplyPatchToken == null) {
            return 0L;
        }
        return nLESafetyApplyPatchToken.swigCPtr;
    }

    public void resume(INLEApplyPatchCallback iNLEApplyPatchCallback) {
        NLEMediaPublicJniJNI.NLESafetyApplyPatchToken_resume(this.swigCPtr, this, INLEApplyPatchCallback.getCPtr(iNLEApplyPatchCallback), iNLEApplyPatchCallback);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLESafetyApplyPatchToken(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
