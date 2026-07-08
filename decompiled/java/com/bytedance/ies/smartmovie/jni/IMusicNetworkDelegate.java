package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public class IMusicNetworkDelegate {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_IMusicNetworkDelegate(j);
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
        SmartMovieJniJNI.IMusicNetworkDelegate_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.IMusicNetworkDelegate_change_ownership(this, this.swigCPtr, true);
    }

    public IMusicNetworkDelegate() {
        this(SmartMovieJniJNI.new_IMusicNetworkDelegate(), true);
        SmartMovieJniJNI.IMusicNetworkDelegate_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(IMusicNetworkDelegate iMusicNetworkDelegate) {
        if (iMusicNetworkDelegate == null) {
            return 0L;
        }
        return iMusicNetworkDelegate.swigCPtr;
    }

    public void cancel(String str) {
        SmartMovieJniJNI.IMusicNetworkDelegate_cancel(this.swigCPtr, this, str);
    }

    public void request(MusicRequestParams musicRequestParams) {
        long j;
        long j2 = this.swigCPtr;
        if (musicRequestParams == null) {
            j = 0;
        } else {
            j = musicRequestParams.LIZ;
        }
        SmartMovieJniJNI.IMusicNetworkDelegate_request__SWIG_2(j2, this, j, musicRequestParams);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public IMusicNetworkDelegate(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void request(MusicRequestParams musicRequestParams, CommonRequestCallback commonRequestCallback) {
        long j;
        long j2 = this.swigCPtr;
        if (musicRequestParams == null) {
            j = 0;
        } else {
            j = musicRequestParams.LIZ;
        }
        SmartMovieJniJNI.IMusicNetworkDelegate_request__SWIG_1(j2, this, j, musicRequestParams, CommonRequestCallback.getCPtr(commonRequestCallback), commonRequestCallback);
    }

    public void request(MusicRequestParams musicRequestParams, CommonRequestCallback commonRequestCallback, MusicRequestCallback musicRequestCallback) {
        long j;
        long j2 = this.swigCPtr;
        if (musicRequestParams == null) {
            j = 0;
        } else {
            j = musicRequestParams.LIZ;
        }
        SmartMovieJniJNI.IMusicNetworkDelegate_request__SWIG_0(j2, this, j, musicRequestParams, CommonRequestCallback.getCPtr(commonRequestCallback), commonRequestCallback, MusicRequestCallback.getCPtr(musicRequestCallback), musicRequestCallback);
    }
}
