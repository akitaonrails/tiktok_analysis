package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVGcmCrypt {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVGcmCrypt(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DAVGcmCrypt() {
        this(DavinciResourceJniJNI.new_DAVGcmCrypt(), true);
    }

    public static boolean isEnabled() {
        return DavinciResourceJniJNI.DAVGcmCrypt_isEnabled();
    }

    public void finalize() {
        delete();
    }

    public static void enable(boolean z) {
        DavinciResourceJniJNI.DAVGcmCrypt_enable(z);
    }

    public static long getCPtr(DAVGcmCrypt dAVGcmCrypt) {
        if (dAVGcmCrypt == null) {
            return 0L;
        }
        return dAVGcmCrypt.swigCPtr;
    }

    public static void setGcmCrypt(DAVGcmCryptFunc dAVGcmCryptFunc) {
        DavinciResourceJniJNI.DAVGcmCrypt_setGcmCrypt(DAVGcmCryptFunc.getCPtr(dAVGcmCryptFunc), dAVGcmCryptFunc);
    }

    public DAVGcmCrypt(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
