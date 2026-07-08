package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEResourceListDownloadCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_NLEResourceListDownloadCallback(j);
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
        NLEResourcesDAVJNI.NLEResourceListDownloadCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEResourcesDAVJNI.NLEResourceListDownloadCallback_change_ownership(this, this.swigCPtr, true);
    }

    public void onSuccess() {
        NLEResourcesDAVJNI.NLEResourceListDownloadCallback_onSuccess(this.swigCPtr, this);
    }

    public NLEResourceListDownloadCallback() {
        this(NLEResourcesDAVJNI.new_NLEResourceListDownloadCallback(), true);
        NLEResourcesDAVJNI.NLEResourceListDownloadCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEResourceListDownloadCallback nLEResourceListDownloadCallback) {
        if (nLEResourceListDownloadCallback == null) {
            return 0L;
        }
        return nLEResourceListDownloadCallback.swigCPtr;
    }

    public void onProgress(float f) {
        NLEResourcesDAVJNI.NLEResourceListDownloadCallback_onProgress(this.swigCPtr, this, f);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEResourceListDownloadCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onFailure(String str, int i, String str2) {
        NLEResourcesDAVJNI.NLEResourceListDownloadCallback_onFailure(this.swigCPtr, this, str, i, str2);
    }
}
