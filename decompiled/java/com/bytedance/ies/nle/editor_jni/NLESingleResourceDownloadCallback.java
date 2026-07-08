package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLESingleResourceDownloadCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_NLESingleResourceDownloadCallback(j);
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
        NLEResourcesDAVJNI.NLESingleResourceDownloadCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEResourcesDAVJNI.NLESingleResourceDownloadCallback_change_ownership(this, this.swigCPtr, true);
    }

    public NLESingleResourceDownloadCallback() {
        this(NLEResourcesDAVJNI.new_NLESingleResourceDownloadCallback(), true);
        NLEResourcesDAVJNI.NLESingleResourceDownloadCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback) {
        if (nLESingleResourceDownloadCallback == null) {
            return 0L;
        }
        return nLESingleResourceDownloadCallback.swigCPtr;
    }

    public void onProgress(int i) {
        if (getClass() == NLESingleResourceDownloadCallback.class) {
            NLEResourcesDAVJNI.NLESingleResourceDownloadCallback_onProgress(this.swigCPtr, this, i);
        } else {
            NLEResourcesDAVJNI.NLESingleResourceDownloadCallback_onProgressSwigExplicitNLESingleResourceDownloadCallback(this.swigCPtr, this, i);
        }
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLESingleResourceDownloadCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onFailure(String str, int i, String str2) {
        NLEResourcesDAVJNI.NLESingleResourceDownloadCallback_onFailure(this.swigCPtr, this, str, i, str2);
    }

    public void onSuccess(String str, String str2, boolean z) {
        NLEResourcesDAVJNI.NLESingleResourceDownloadCallback_onSuccess(this.swigCPtr, this, str, str2, z);
    }
}
