package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class EpResourceCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_EpResourceCallback(j);
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
        NLEResourcesDAVJNI.EpResourceCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEResourcesDAVJNI.EpResourceCallback_change_ownership(this, this.swigCPtr, true);
    }

    public EpResourceCallback() {
        this(NLEResourcesDAVJNI.new_EpResourceCallback(), true);
        NLEResourcesDAVJNI.EpResourceCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EpResourceCallback epResourceCallback) {
        if (epResourceCallback == null) {
            return 0L;
        }
        return epResourceCallback.swigCPtr;
    }

    public void onProgress(float f) {
        NLEResourcesDAVJNI.EpResourceCallback_onProgress(this.swigCPtr, this, f);
    }

    public void onSuccess(String str) {
        NLEResourcesDAVJNI.EpResourceCallback_onSuccess(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public EpResourceCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onFailure(int i, String str) {
        NLEResourcesDAVJNI.EpResourceCallback_onFailure(this.swigCPtr, this, i, str);
    }
}
