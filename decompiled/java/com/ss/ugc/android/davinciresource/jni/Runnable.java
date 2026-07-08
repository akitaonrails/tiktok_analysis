package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class Runnable {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_Runnable(j);
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
        DavinciResourceJniJNI.Runnable_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.Runnable_change_ownership(this, this.swigCPtr, true);
    }

    public void run() {
        DavinciResourceJniJNI.Runnable_run(this.swigCPtr, this);
    }

    public Runnable() {
        this(DavinciResourceJniJNI.new_Runnable(), true);
        DavinciResourceJniJNI.Runnable_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(Runnable runnable) {
        if (runnable == null) {
            return 0L;
        }
        return runnable.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public Runnable(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
