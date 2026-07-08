package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEResourceDownloadCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_NLEResourceDownloadCallback(j);
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
        NLEResourcesDAVJNI.NLEResourceDownloadCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEResourcesDAVJNI.NLEResourceDownloadCallback_change_ownership(this, this.swigCPtr, true);
    }

    public NLEResourceDownloadCallback() {
        this(NLEResourcesDAVJNI.new_NLEResourceDownloadCallback(), true);
        NLEResourcesDAVJNI.NLEResourceDownloadCallback_director_connect(this, this.swigCPtr, true, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEResourceDownloadCallback nLEResourceDownloadCallback) {
        if (nLEResourceDownloadCallback == null) {
            return 0L;
        }
        return nLEResourceDownloadCallback.swigCPtr;
    }

    public void onNeedFetch(VecString vecString) {
        NLEResourcesDAVJNI.NLEResourceDownloadCallback_onNeedFetch(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void onProgress(float f) {
        NLEResourcesDAVJNI.NLEResourceDownloadCallback_onProgress(this.swigCPtr, this, f);
    }

    public void onSuccess(NLEModel nLEModel) {
        NLEResourcesDAVJNI.NLEResourceDownloadCallback_onSuccess(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEResourceDownloadCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onFailure(String str, int i, String str2) {
        NLEResourcesDAVJNI.NLEResourceDownloadCallback_onFailure(this.swigCPtr, this, str, i, str2);
    }
}
