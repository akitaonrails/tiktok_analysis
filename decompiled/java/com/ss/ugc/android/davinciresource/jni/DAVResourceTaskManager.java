package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVResourceTaskManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVResourceTaskManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVResourceTaskManager dAVResourceTaskManager) {
        if (dAVResourceTaskManager == null) {
            return 0L;
        }
        return dAVResourceTaskManager.swigCPtr;
    }

    public int cancelTask(long j) {
        return DavinciResourceJniJNI.DAVResourceTaskManager_cancelTask(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DAVResourceTaskManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
