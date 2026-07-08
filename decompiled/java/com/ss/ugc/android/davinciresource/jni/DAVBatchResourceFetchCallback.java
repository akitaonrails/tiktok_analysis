package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVBatchResourceFetchCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVBatchResourceFetchCallback(j);
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
        DavinciResourceJniJNI.DAVBatchResourceFetchCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.DAVBatchResourceFetchCallback_change_ownership(this, this.swigCPtr, true);
    }

    public DAVBatchResourceFetchCallback() {
        this(DavinciResourceJniJNI.new_DAVBatchResourceFetchCallback(), true);
        DavinciResourceJniJNI.DAVBatchResourceFetchCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback) {
        if (dAVBatchResourceFetchCallback == null) {
            return 0L;
        }
        return dAVBatchResourceFetchCallback.swigCPtr;
    }

    public void onSuccess(DAVResource dAVResource) {
        DavinciResourceJniJNI.DAVBatchResourceFetchCallback_onSuccess(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DAVBatchResourceFetchCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onError(DAVResource dAVResource, int i) {
        DavinciResourceJniJNI.DAVBatchResourceFetchCallback_onError(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, i);
    }
}
