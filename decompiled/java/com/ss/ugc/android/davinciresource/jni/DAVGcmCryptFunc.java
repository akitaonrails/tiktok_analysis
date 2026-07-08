package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVGcmCryptFunc {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVGcmCryptFunc(j);
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
        DavinciResourceJniJNI.DAVGcmCryptFunc_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.DAVGcmCryptFunc_change_ownership(this, this.swigCPtr, true);
    }

    public DAVGcmCryptFunc() {
        this(DavinciResourceJniJNI.new_DAVGcmCryptFunc(), true);
        DavinciResourceJniJNI.DAVGcmCryptFunc_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVGcmCryptFunc dAVGcmCryptFunc) {
        if (dAVGcmCryptFunc == null) {
            return 0L;
        }
        return dAVGcmCryptFunc.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DAVGcmCryptFunc(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public String decrypt(String str, String str2) {
        return DavinciResourceJniJNI.DAVGcmCryptFunc_decrypt(this.swigCPtr, this, str, str2);
    }
}
