package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public class MusicRequestCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_MusicRequestCallback(j);
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
        SmartMovieJniJNI.MusicRequestCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.MusicRequestCallback_change_ownership(this, this.swigCPtr, true);
    }

    public MusicRequestCallback() {
        this(SmartMovieJniJNI.new_MusicRequestCallback(), true);
        SmartMovieJniJNI.MusicRequestCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(MusicRequestCallback musicRequestCallback) {
        if (musicRequestCallback == null) {
            return 0L;
        }
        return musicRequestCallback.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public MusicRequestCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onInfoCallBack(MusicRequestCallbackInfoType musicRequestCallbackInfoType, float f, int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        SmartMovieJniJNI.MusicRequestCallback_onInfoCallBack(this.swigCPtr, this, musicRequestCallbackInfoType.swigValue(), f, i, str, UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
    }
}
