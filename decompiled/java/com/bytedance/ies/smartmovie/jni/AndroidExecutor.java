package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public class AndroidExecutor {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_AndroidExecutor(j);
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
        SmartMovieJniJNI.AndroidExecutor_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.AndroidExecutor_change_ownership(this, this.swigCPtr, true);
    }

    public AndroidExecutor() {
        this(SmartMovieJniJNI.new_AndroidExecutor(), true);
        SmartMovieJniJNI.AndroidExecutor_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(AndroidExecutor androidExecutor) {
        if (androidExecutor == null) {
            return 0L;
        }
        return androidExecutor.swigCPtr;
    }

    public void cancel(long j) {
        SmartMovieJniJNI.AndroidExecutor_cancel(this.swigCPtr, this, j);
    }

    public long commitTask(Runnable runnable) {
        long j;
        long j2 = this.swigCPtr;
        if (runnable == null) {
            j = 0;
        } else {
            j = runnable.LIZ;
        }
        return SmartMovieJniJNI.AndroidExecutor_commitTask(j2, this, j, runnable);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public AndroidExecutor(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public long postDelayedTask(Runnable runnable, long j) {
        long j2;
        long j3 = this.swigCPtr;
        if (runnable == null) {
            j2 = 0;
        } else {
            j2 = runnable.LIZ;
        }
        return SmartMovieJniJNI.AndroidExecutor_postDelayedTask(j3, this, j2, runnable, j);
    }
}
