package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVResourceFetchCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVResourceFetchCallback(j);
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
        DavinciResourceJniJNI.DAVResourceFetchCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.DAVResourceFetchCallback_change_ownership(this, this.swigCPtr, true);
    }

    public DAVResourceFetchCallback() {
        this(DavinciResourceJniJNI.new_DAVResourceFetchCallback(), true);
        DavinciResourceJniJNI.DAVResourceFetchCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVResourceFetchCallback dAVResourceFetchCallback) {
        if (dAVResourceFetchCallback == null) {
            return 0L;
        }
        return dAVResourceFetchCallback.swigCPtr;
    }

    public void onError(int i) {
        DavinciResourceJniJNI.DAVResourceFetchCallback_onError(this.swigCPtr, this, i);
    }

    public void onProgress(int i) {
        DavinciResourceJniJNI.DAVResourceFetchCallback_onProgress(this.swigCPtr, this, i);
    }

    public void onSuccess(DAVResource dAVResource) {
        DavinciResourceJniJNI.DAVResourceFetchCallback_onSuccess(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DAVResourceFetchCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
