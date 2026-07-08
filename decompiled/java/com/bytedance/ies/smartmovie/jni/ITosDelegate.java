package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public class ITosDelegate {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_ITosDelegate(j);
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
        SmartMovieJniJNI.ITosDelegate_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.ITosDelegate_change_ownership(this, this.swigCPtr, true);
    }

    public ITosDelegate() {
        this(SmartMovieJniJNI.new_ITosDelegate(), true);
        SmartMovieJniJNI.ITosDelegate_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ITosDelegate iTosDelegate) {
        if (iTosDelegate == null) {
            return 0L;
        }
        return iTosDelegate.swigCPtr;
    }

    public void getTosUrl(String str) {
        SmartMovieJniJNI.ITosDelegate_getTosUrl__SWIG_1(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ITosDelegate(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void getTosUrl(String str, CommonRequestCallback commonRequestCallback) {
        SmartMovieJniJNI.ITosDelegate_getTosUrl__SWIG_0(this.swigCPtr, this, str, CommonRequestCallback.getCPtr(commonRequestCallback), commonRequestCallback);
    }
}
