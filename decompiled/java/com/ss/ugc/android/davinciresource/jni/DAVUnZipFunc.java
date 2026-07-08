package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVUnZipFunc {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVUnZipFunc(j);
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
        DavinciResourceJniJNI.DAVUnZipFunc_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.DAVUnZipFunc_change_ownership(this, this.swigCPtr, true);
    }

    public DAVUnZipFunc() {
        this(DavinciResourceJniJNI.new_DAVUnZipFunc(), true);
        DavinciResourceJniJNI.DAVUnZipFunc_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVUnZipFunc dAVUnZipFunc) {
        if (dAVUnZipFunc == null) {
            return 0L;
        }
        return dAVUnZipFunc.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DAVUnZipFunc(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean unZip(String str, String str2, boolean z) {
        return DavinciResourceJniJNI.DAVUnZipFunc_unZip(this.swigCPtr, this, str, str2, z);
    }
}
