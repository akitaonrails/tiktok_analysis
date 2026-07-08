package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVDBManagerWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVDBManagerWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DAVDBManagerWrapper() {
        this(DavinciResourceJniJNI.new_DAVDBManagerWrapper(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVDBManagerWrapper dAVDBManagerWrapper) {
        if (dAVDBManagerWrapper == null) {
            return 0L;
        }
        return dAVDBManagerWrapper.swigCPtr;
    }

    public static void setDBManagerFactory(DAVDBManagerFactory dAVDBManagerFactory) {
        DavinciResourceJniJNI.DAVDBManagerWrapper_setDBManagerFactory(DAVDBManagerFactory.getCPtr(dAVDBManagerFactory), dAVDBManagerFactory);
    }

    public DAVDBManagerWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
