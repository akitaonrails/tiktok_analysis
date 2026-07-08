package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVCreator {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVCreator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DAVCreator() {
        this(DavinciResourceJniJNI.new_DAVCreator(), true);
    }

    public static DAVResourceManager createDefaultResourceManager() {
        long jDAVCreator_createDefaultResourceManager = DavinciResourceJniJNI.DAVCreator_createDefaultResourceManager();
        if (jDAVCreator_createDefaultResourceManager == 0) {
            return null;
        }
        return new DAVResourceManager(jDAVCreator_createDefaultResourceManager, true);
    }

    public static DAVResourceTaskManager createDefaultTaskManager() {
        long jDAVCreator_createDefaultTaskManager = DavinciResourceJniJNI.DAVCreator_createDefaultTaskManager();
        if (jDAVCreator_createDefaultTaskManager == 0) {
            return null;
        }
        return new DAVResourceTaskManager(jDAVCreator_createDefaultTaskManager, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVCreator dAVCreator) {
        if (dAVCreator == null) {
            return 0L;
        }
        return dAVCreator.swigCPtr;
    }

    public DAVCreator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
