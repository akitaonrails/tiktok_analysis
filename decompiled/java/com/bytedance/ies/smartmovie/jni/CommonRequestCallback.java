package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public class CommonRequestCallback {
    public boolean alreadyCallback;
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_CommonRequestCallback(j);
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
        SmartMovieJniJNI.CommonRequestCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.CommonRequestCallback_change_ownership(this, this.swigCPtr, true);
    }

    public CommonRequestCallback() {
        this(SmartMovieJniJNI.new_CommonRequestCallback(), true);
        SmartMovieJniJNI.CommonRequestCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(CommonRequestCallback commonRequestCallback) {
        if (commonRequestCallback == null) {
            return 0L;
        }
        return commonRequestCallback.swigCPtr;
    }

    public void onSuccess(String str) {
        if (this.alreadyCallback) {
            return;
        }
        this.alreadyCallback = true;
        SmartMovieJniJNI.CommonRequestCallback_onSuccess(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public CommonRequestCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onFailure(int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        SmartMovieJniJNI.CommonRequestCallback_onFailure(this.swigCPtr, this, i, str, UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
    }
}
