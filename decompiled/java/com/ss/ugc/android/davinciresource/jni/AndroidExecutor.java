package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class AndroidExecutor {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_AndroidExecutor(j);
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
        DavinciResourceJniJNI.AndroidExecutor_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.AndroidExecutor_change_ownership(this, this.swigCPtr, true);
    }

    public AndroidExecutor() {
        this(DavinciResourceJniJNI.new_AndroidExecutor(), true);
        DavinciResourceJniJNI.AndroidExecutor_director_connect(this, this.swigCPtr, true, true);
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

    public void cancelById(long j) {
        DavinciResourceJniJNI.AndroidExecutor_cancelById(this.swigCPtr, this, j);
    }

    public long commit(Runnable runnable) {
        return DavinciResourceJniJNI.AndroidExecutor_commit(this.swigCPtr, this, Runnable.getCPtr(runnable), runnable);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public AndroidExecutor(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public long postDelayed(Runnable runnable, long j) {
        return DavinciResourceJniJNI.AndroidExecutor_postDelayed(this.swigCPtr, this, Runnable.getCPtr(runnable), runnable, j);
    }
}
