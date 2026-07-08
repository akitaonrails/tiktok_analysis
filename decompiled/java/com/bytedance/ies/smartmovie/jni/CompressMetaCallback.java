package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public class CompressMetaCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_CompressMetaCallback(j);
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
        SmartMovieJniJNI.CompressMetaCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.CompressMetaCallback_change_ownership(this, this.swigCPtr, true);
    }

    public CompressMetaCallback() {
        this(SmartMovieJniJNI.new_CompressMetaCallback(), true);
        SmartMovieJniJNI.CompressMetaCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(CompressMetaCallback compressMetaCallback) {
        if (compressMetaCallback == null) {
            return 0L;
        }
        return compressMetaCallback.swigCPtr;
    }

    public void onSuccess(VecMeta vecMeta) {
        SmartMovieJniJNI.CompressMetaCallback_onSuccess(this.swigCPtr, this, VecMeta.LJ(vecMeta), vecMeta);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public CompressMetaCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onFailure(int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        SmartMovieJniJNI.CompressMetaCallback_onFailure(this.swigCPtr, this, i, str, UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
    }
}
