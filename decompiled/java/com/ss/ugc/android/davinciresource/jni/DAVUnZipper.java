package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVUnZipper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVUnZipper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DAVUnZipper() {
        this(DavinciResourceJniJNI.new_DAVUnZipper(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVUnZipper dAVUnZipper) {
        if (dAVUnZipper == null) {
            return 0L;
        }
        return dAVUnZipper.swigCPtr;
    }

    public static void setUnZipper(DAVUnZipFunc dAVUnZipFunc) {
        DavinciResourceJniJNI.DAVUnZipper_setUnZipper(DAVUnZipFunc.getCPtr(dAVUnZipFunc), dAVUnZipFunc);
    }

    public DAVUnZipper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
